package com.monsanto.mbt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Shipment {
	
	 public static List<Widget> getSampleWidgets() {
	        List<Widget> widgets = new ArrayList<Widget>();

	        widgets.add(new Widget(1, "Red", stringToDateConverter("01-01-2006")));
	        widgets.add(new Widget(2, "Blue",  stringToDateConverter("02-03-2007")));
	        widgets.add(new Widget(3, "Red",  stringToDateConverter("03-09-2006")));
	        widgets.add(new Widget(4, "Green", stringToDateConverter( "04-01-2009")));
	        widgets.add(new Widget(5, "Green",  stringToDateConverter("05-07-2011")));
	        widgets.add(new Widget(6, "Blue", stringToDateConverter( "06-02-2016")));
	        widgets.add(new Widget(7, "Green",  stringToDateConverter("07-01-2008")));
	        widgets.add(new Widget(8, "Blue",  stringToDateConverter("08-02-2009")));
	        widgets.add(new Widget(9, "Red",  stringToDateConverter("09-01-2005")));
	        widgets.add(new Widget(10, "Blue",  stringToDateConverter("01-03-2013")));
	        widgets.add(new Widget(22, "Blue",  stringToDateConverter("02-13-2007")));
	        widgets.add(new Widget(23, "Red",  stringToDateConverter("03-14-2006")));
	        widgets.add(new Widget(25, "Green",  stringToDateConverter("05-16-2011")));
	        widgets.add(new Widget(24, "Red",  stringToDateConverter("04-15-2009")));

	        return widgets;
	    }

	    public static Date stringToDateConverter(String strDate){
	        Date parsedDate = null;
	        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
	        try {
	            parsedDate = formatter.parse(strDate);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	        return parsedDate;
	    }

	public static void main(String[] args) {

		List<Widget> empArr1 = Shipment.getSampleWidgets();
		Widget[] empArr  =empArr1.toArray(new Widget[empArr1.size()]);
		 Arrays.sort(empArr);
        
        Arrays.sort(empArr, Widget.colorComparator);
        System.out.println("Widget list sorted by color");
        

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %30s %50s", "Serial No", "Color", "Production Date");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(Widget student: empArr){
            System.out.format("%10s %30s %50s",
                    student.getSerialNumber(), student.getColor(), student.getProductionDate());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");

        
        Arrays.sort(empArr, Widget.productionDateComparator);
        System.out.println("Widget list sorted by  Production Date");
        
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%10s %30s %50s","Serial No", "Color", "Production Date");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        for(Widget student: empArr){
            System.out.format("%10s %30s %50s",
                    student.getSerialNumber(), student.getColor(), student.getProductionDate());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------");

        
       }
	
}