package br.com.una.apa.p02e01;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

public class BarChart_AWT extends ApplicationFrame
{
   public BarChart_AWT( String applicationTitle , String chartTitle )
   {
      super( applicationTitle );        
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         "Category",            
         "Score",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
      setContentPane( chartPanel ); 
   }
   private CategoryDataset createDataset( )
   {
      final String tamanho = "TAMANHO";        
      final String operacoes = "OPERAÇÕES";        
      final String ford = "FORD";        
      final String speed = "tamanho";        
      final String millage = "Millage";        
      final String userrating = "User Rating";        
      final String safety = "operações";        
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  

      dataset.addValue( 10.0 , tamanho , speed );        
      dataset.addValue( 5.0 , operacoes , safety );        
                   

      return dataset; 
   }
   public static void main( String[ ] args )
   {
      BarChart_AWT chart = new BarChart_AWT("Car Usage Statistics", "Which car do you like?");
      chart.pack( );        
      RefineryUtilities.centerFrameOnScreen( chart );        
      chart.setVisible( true ); 
   }
}