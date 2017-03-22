package br.com.una.apa.p02e01;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYBarDataset;

public class BarsFromArrays {
   public static void main(String[] args) {
      double[] xvalues = new double[]{1,2,3,4,5};
      double[] yvalues = new double[]{10,15,8,37,23};
      double[][] valuepairs = new double[2][];
      valuepairs[0] = xvalues;
      valuepairs[1] = yvalues;
      DefaultXYDataset set = new DefaultXYDataset();
      set.addSeries("Values",valuepairs);      
      XYBarDataset barset = new XYBarDataset(set,0.8);
      JFreeChart chart = ChartFactory.createXYBarChart(
         "Bars from arrays","x",false,"y",
         barset,PlotOrientation.VERTICAL,true, true, false);
      JFrame frame = new JFrame("Test");
      frame.setContentPane(new ChartPanel(chart));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
}