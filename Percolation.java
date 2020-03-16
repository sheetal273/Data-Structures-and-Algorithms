
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;


public class Percolation
{

	private static int[][] grid;
	private static int n;
	private final WeightedQuickUnionUF uf;
	private final WeightedQuickUnionUF wqfFull;
	private final int virtualBottom;
	private final int virtualTop;
	private int openSites;

	// creates n-by-n grid, with all sites initially blocked
	public Percolation(final int n)
	{

		if (n <= 0)
		{
			throw new IllegalArgumentException("N must be > 0");
		}

		uf = new WeightedQuickUnionUF(n * n + 2);
		wqfFull = new WeightedQuickUnionUF(n * n + 1); // includes virtual top

		grid = new int[n + 1][n + 1];
		Percolation.n = n;

		virtualBottom = n * n + 1;
		virtualTop = n * n;
		openSites = 0;

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				grid[i][j] = 1;
			}
		}
	}

	private boolean isOnGrid(final int row, final int col)
	{

		final int shiftRow = row - 1 + 1;
		final int shiftCol = col - 1 + 1;

		return (shiftRow >= 0 && shiftRow < n && shiftCol >= 0 && shiftCol < n);
	}

	private int flattenGrid(int row, int col)
	{
		row = row + 1;
		col = col + 1;
		return n * (row - 1) + col;
	}


	private void validateSite(final int row, final int col)
	{

		if (!isOnGrid(row, col))
		{
			throw new IndexOutOfBoundsException();
		}

	}


	// opens the site (row, col) if it is not open already
	public void open(final int row, final int col)
	{

		validateSite(row, col);

		final int shiftRow = row - 1 + 1;
		final int shiftCol = col - 1 + 1;


		if (isOpen(row, col))
		{
			return;
		}

		final int flatIndex = flattenGrid(row, col);

		grid[shiftRow][shiftCol] = 0;
		openSites++;

		if (row == 0)
		{
			uf.union(virtualTop, flatIndex);
			wqfFull.union(virtualTop, flatIndex);
		}

		if (row == n - 1)
		{
			uf.union(virtualBottom, flatIndex);
		}

		if (isOnGrid(row, col + 1) && isOpen(row, col + 1))
		{
			uf.union(flatIndex, flattenGrid(row, col + 1));
			wqfFull.union(flatIndex, flattenGrid(row, col + 1));
		}

		if (isOnGrid(row, col - 1) && isOpen(row, col - 1))
		{
			uf.union(flatIndex, flattenGrid(row, col - 1));
			wqfFull.union(flatIndex, flattenGrid(row, col - 1));
		}

		if (isOnGrid(row - 1, col) && isOpen(row - 1, col))
		{
			uf.union(flatIndex, flattenGrid(row - 1, col));
			wqfFull.union(flatIndex, flattenGrid(row - 1, col));
		}

		if (isOnGrid(row + 1, col) && isOpen(row + 1, col))
		{
			uf.union(flatIndex, flattenGrid(row + 1, col));
			wqfFull.union(flatIndex, flattenGrid(row + 1, col));
		}

		// debug
		runTests();

	}

	// is the site (row, col) open?
	public boolean isOpen(final int row, final int col)
	{

		validateSite(row, col);
		return (grid[row][col] == 0);
	}

	// is the site (row, col) full?
	@SuppressWarnings("deprecation")
	public boolean isFull(final int row, final int col)
	{

		validateSite(row, col);

		return wqfFull.connected(virtualTop, flattenGrid(row, col));

	}

	// returns the number of open sites
	public int numberOfOpenSites()
	{

		return openSites;
	}

	// does the system percolate?
	@SuppressWarnings("deprecation")
	public boolean percolates()
	{

		return uf.connected(virtualTop, virtualBottom);

	}

	public static void main(final String[] args)
	{

		final int size = Integer.parseInt(args[0]);

		final Percolation obj = new Percolation(size);

		final int argCount = args.length;


		for (int i = 1; i < argCount; i += 2)
		{

			final int row = Integer.parseInt(args[i]);
			final int col = Integer.parseInt(args[i + 1]);
			obj.open(row, col);
			if (!obj.percolates())
			{
				StdOut.print("Does not percolate %n");

			}
			else
			{
				StdOut.printf("%nThe System percolates %n");
			}
		}
	}

	private void runTests()
	{
		for (int row = 0; row < n; row++)
		{
			for (int col = 0; col < n; col++)
			{
				if (isOpen(row, col))
				{
					StdOut.printf("Row: %d Col: %d is Open %n", row, col);
				}
				else
				{
					StdOut.printf("Row: %d Col: %d is not Open %n", row, col);
				}
				if (isFull(row, col))
				{
					StdOut.printf("Row: %d Col: %d is Full %n", row, col);
				}
				else
				{
					StdOut.printf("Row: %d Col: %d is not Full %n", row, col);
				}
			}
		}
		StdOut.printf("Sites Open: %d %n", numberOfOpenSites());
		if (percolates())
		{
			StdOut.printf("Percolates %n");
		}
		else
		{
			StdOut.printf("Does not Percolate %n");
		}
	}
}
