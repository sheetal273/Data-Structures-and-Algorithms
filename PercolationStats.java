import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats
{

	private final int triallCount;
	private final double[] trialResults;
	private final double CONFIDENCE_95 = 1.96;

	// perform independent trials on an n-by-n grid
	public PercolationStats(final int n, final int trials)
	{
		if (n <= 0 || trials <= 0)
		{
			throw new IllegalArgumentException();
		}

		triallCount = trials;
		trialResults = new double[trials + 1];
		for (int i = 1; i <= trials; i++)
		{
			final Percolation percolation = new Percolation(n);
			while (!percolation.percolates())
			{
				final int row = StdRandom.uniform(1, n + 1);
				final int col = StdRandom.uniform(1, n + 1);
				percolation.open(row - 1, col - 1);
			}

			final int openSites = percolation.numberOfOpenSites();
			final double result = (double)openSites / n * n;

			trialResults[i] = result;
		}
	}

	// sample mean of percolation threshold
	public double mean()
	{
		return StdStats.mean(trialResults);
	}

	// sample standard deviation of percolation threshold
	public double stddev()
	{
		return StdStats.stddev(trialResults);
	}

	// low endpoint of 95% confidence interval
	public double confidenceLo()
	{
		return mean() - ((CONFIDENCE_95 * stddev()) / Math.sqrt(triallCount));
	}

	// high endpoint of 95% confidence interval
	public double confidenceHi()
	{
		return mean() + ((CONFIDENCE_95 * stddev()) / Math.sqrt(triallCount));
	}

	// test client (see below)
	public static void main(final String[] args)
	{

		int gridSize = 10;
		int trials = 10;

		if (args.length >= 2)
		{
			gridSize = Integer.parseInt(args[0]);
			trials = Integer.parseInt(args[1]);
		}

		final PercolationStats stats = new PercolationStats(gridSize, trials);

		  String confidence = stats.confidenceLo() + ", " + stats.confidenceHi();
	      StdOut.println("mean                    = " + stats.mean());
	      StdOut.println("stddev                  = " + stats.stddev());
	      StdOut.println("95% confidence interval = " + confidence);
	}
}
