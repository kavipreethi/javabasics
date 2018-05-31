package com.basic;

public class InVoice {
	String Number;
	String Description;
	int Quantity;
	double Price;
	
	

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		if(Quantity<0)
		{
			this.Quantity=0;
		}
		else
		{
			this.Quantity = Quantity;
		}
	}
		
		

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		if(price<0)
		{
			this.Price=0.0;
		}
		else
		{
			this.Price=price;
		}
		
	}

	 public double getInVoiceAmount()
	{ 
		
		return Price*Quantity;
	}
	public static void main(String[]args)
	{
		InVoice invoice1 = new InVoice();
		invoice1.setDescription("nut");
		invoice1.setQuantity(5);
		invoice1.setPrice(50);
		System.out.println(invoice1.getQuantity());
		System.out.println(invoice1.getInVoiceAmount());
		System.out.println(invoice1.getDescription());
	}
		
		
		
		
		
		
		
		
	}
	





