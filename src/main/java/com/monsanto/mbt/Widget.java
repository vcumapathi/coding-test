package com.monsanto.mbt;

import java.util.Comparator;
import java.util.Date;


public class Widget implements Comparable<Widget>{
    private int serialNumber;
    private String color;
    private Date productionDate;

    public Widget(int serialNumber, String color, Date productionDate) {
        this.serialNumber = serialNumber;
        this.color = color;
        this.productionDate = productionDate;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

	public int compareTo(Widget o) {
		
		return o.serialNumber;
	}

	@Override
	public String toString() {
		return "Widget [serialNumber=" + serialNumber + ", color=" + color + ", productionDate=" + productionDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((productionDate == null) ? 0 : productionDate.hashCode());
		result = prime * result + serialNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Widget other = (Widget) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (productionDate == null) {
			if (other.productionDate != null)
				return false;
		} else if (!productionDate.equals(other.productionDate))
			return false;
		if (serialNumber != other.serialNumber)
			return false;
		return true;
	}
	
	   public static final Comparator<Widget> colorComparator = new Comparator<Widget>(){

	        public int compare(Widget o1, Widget o2) {
	            return o1.color.compareTo(o2.color);
	        }
	      
	    };
	  
	    public static final Comparator<Widget> productionDateComparator = new Comparator<Widget>(){

	        public int compare(Widget o1, Widget o2) {
	            return o1.productionDate.compareTo(o2.productionDate);
	        }
	      
	    };



}
