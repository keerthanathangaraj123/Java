class ShampooRunner{
    public static void main(String hairSmoothing[]){
     Shampoo hair = new Shampoo();
     hair.brandName="Pantene";
     hair.qty = "50ml";
     hair.type = "Clarifying Shampoo";
      hair.price = 90.00;
      hair.mgfDate = "22-07-2022";
      hair.expDate = "30-05-2024";
	  System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + hair.brandName);
	  System.out.println("The qty of shampoo " + hair.qty);
	  System.out.println("The Type of shampoo " + hair.type);
	  System.out.println("The Price of shampoo " + hair.price);
	  System.out.println("The manufacturing Date of shampoo " + hair.mgfDate);
	  System.out.println("The expire Date of shampoo " + hair.expDate);
	  
	  Shampoo ref = new Shampoo();
	  ref.brandName = "Head & Shoulders";
	  ref.qty = "50ml";
	  ref.type="Moisturizing Shampoo";
	  ref.price = 40.00;
	  ref.mgfDate = "22-04-2023";
	  ref.expDate = "22-04-2026";
	  
	  System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + ref.brandName);
	  System.out.println("The qty of shampoo " + ref.qty);
	  System.out.println("The Type of shampoo " + ref.type);
	  System.out.println("The Price of shampoo " + ref.price);
	  System.out.println("The manufacturing Date of shampoo " + ref.mgfDate);
	  System.out.println("The expire Date of shampoo " + ref.expDate);
	  
	  
	  Shampoo Type = new Shampoo();
	  Type.brandName="";
	  Type.qty="20ml";
	  Type.type="Volumizing Shampoo";
	  Type.price=100.00;
	  Type.mgfDate="30-06-2021";
	  Type.expDate="24-08-2023";
	  
	  System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + Type.brandName);
	  System.out.println("The qty of shampoo " + Type.qty);
	  System.out.println("The Type of shampoo " + Type.type);
	  System.out.println("The Price of shampoo " + Type.price);
	  System.out.println("The manufacturing Date of shampoo " + Type.mgfDate);
	  System.out.println("The expire Date of shampoo " + Type.expDate);
	  
	  Shampoo Price = new Shampoo();
	  Price.brandName="Dove";
	  Price.qty="40ml";
	  Price.type="Color-Protecting Shampoo";
	  Price.price=200.00;
	  Price.mgfDate="15-06-2021";
	  Price.expDate="30-09-2023";
	  
	  System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + Price.brandName);
	  System.out.println("The qty of shampoo " + Price.qty);
	  System.out.println("The Type of shampoo " + Price.type);
	  System.out.println("The Price of shampoo " + Price.price);
	  System.out.println("The manufacturing Date of shampoo " + Price.mgfDate);
	  System.out.println("The expire Date of shampoo " + Price.expDate);
	  
	  
	  Shampoo eq = new Shampoo();
	  eq.brandName="Herbal Essences";
	  eq.qty="300ml";
	  eq.type="smoothing";
	  eq.price=1050.00;
	  eq.mgfDate="25-06-2024";
	  eq.expDate="23-09-2027";
	  
	   System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + eq.brandName);
	  System.out.println("The qty of shampoo " + eq.qty);
	  System.out.println("The Type of shampoo " + eq.type);
	  System.out.println("The Price of shampoo " + eq.price);
	  System.out.println("The manufacturing Date of shampoo " + eq.mgfDate);
	  System.out.println("The expire Date of shampoo " + eq.expDate);
	  
	  Shampoo ref2 = new Shampoo();
	  ref2.brandName="Tresemmé";
	  ref2.qty="300ml";
	  ref2.type="hair smoothing";
	  ref2.price=2500.00;
	  ref2.mgfDate="31-06-2024";
	  ref2.expDate="04-09-2027";
	  
	  System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + ref2.brandName);
	  System.out.println("The qty of shampoo " + ref2.qty);
	  System.out.println("The Type of shampoo " + ref2.type);
	  System.out.println("The Price of shampoo " + ref2.price);
	  System.out.println("The manufacturing Date of shampoo " + ref2.mgfDate);
	  System.out.println("The expire Date of shampoo " + ref2.expDate);
	  
	  Shampoo Date = new Shampoo();
	  Date.brandName="Redken";
	  Date.qty="500ml";
	  Date.price=4000.00;
	  Date.mgfDate="31-09-2024";
	  Date.expDate="08-06-2027";
	  Date.type="conditioner";
	  
	  System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + Date.brandName);
	  System.out.println("The qty of shampoo " + Date.qty);
	  System.out.println("The Type of shampoo " + Date.type);
	  System.out.println("The Price of shampoo " + Date.price);
	  System.out.println("The manufacturing Date of shampoo " + Date.mgfDate);
	  System.out.println("The expire Date of shampoo " +Date.expDate);
	  
	  
	  Shampoo out = new Shampoo();
	  out.brandName="Suave";
      out.qty="200ml";	  
	  out.price=600.00;
	  out.mgfDate="20-05-2055";
	  out.expDate="20-06-2057";
	  
	  System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + out.brandName);
	  System.out.println("The qty of shampoo " + out.qty);
	  System.out.println("The Type of shampoo " + out.type);
	  System.out.println("The Price of shampoo " + out.price);
	  System.out.println("The manufacturing Date of shampoo " + out.mgfDate);
	  System.out.println("The expire Date of shampoo " +out.expDate);
	  
	  Shampoo ln=new Shampoo();
	  ln.brandName="Nexxus";
	  ln.qty="300ml";
	  ln.price=90.00;
	  ln.mgfDate="02-09-2023";
	  ln.expDate="09-08-2026";
	  ln.type="Sulfate-Free Shampoo";
	  
	  
	  System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + ln.brandName);
	  System.out.println("The qty of shampoo " + ln.qty);
	  System.out.println("The Type of shampoo " + ln.type);
	  System.out.println("The Price of shampoo " + ln.price);
	  System.out.println("The manufacturing Date of shampoo " + ln.mgfDate);
	  System.out.println("The expire Date of shampoo " +ln.expDate);
	  
	  Shampoo ref3 = new Shampoo();
	  
	  ref3.type="Anti-Dandruff Shampoo";
	  ref3.brandName="Aveda";
	  ref3.qty="80ml";
	  ref3.price=300.00;
	  ref3.mgfDate="05-08-2024";
	  ref3.expDate="06-07-2027";
	  
	  System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + ref3.brandName);
	  System.out.println("The qty of shampoo " + ref3.qty);
	  System.out.println("The Type of shampoo " + ref3.type);
	  System.out.println("The Price of shampoo " + ref3.price);
	  System.out.println("The manufacturing Date of shampoo " + ref3.mgfDate);
	  System.out.println("The expire Date of shampoo " +ref3.expDate);
	  
	  Shampoo ref4 = new Shampoo();
	  ref4.type="Dandruff free Shampoo";
	  ref4.brandName="veda";
	  ref4.qty="50ml";
	  ref4.price=400.00;
	  ref4.mgfDate="06-08-2023";
	  ref4.expDate="09-06-2026";
	  
	  System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + ref4.brandName);
	  System.out.println("The qty of shampoo " + ref4.qty);
	  System.out.println("The Type of shampoo " + ref4.type);
	  System.out.println("The Price of shampoo " + ref4.price);
	  System.out.println("The manufacturing Date of shampoo " + ref4.mgfDate);
	  System.out.println("The expire Date of shampoo " +ref4.expDate);
	  
	  Shampoo print = new Shampoo();
	  print.brandName="Kerastase";
	  print.qty="350ml";
	  print.type="Dry Shampoo";
	  print.price=2900.30;
	  print.mgfDate="05-04-2020";
	  print.expDate="08-07-2022";
	  
	  System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + print.brandName);
	  System.out.println("The qty of shampoo " + print.qty);
	  System.out.println("The Type of shampoo " + print.type);
	  System.out.println("The Price of shampoo " + print.price);
	  System.out.println("The manufacturing Date of shampoo " + print.mgfDate);
	  System.out.println("The expire Date of shampoo " +print.expDate);
	  
	  Shampoo name = new Shampoo();
	  name.brandName="Living Proof";
	  name.qty="550ml";
	  name.price=320.83;
	  name.type="Baby Shampoo";
	  name.mgfDate="01-01-2001";
	  name.expDate="04-05-2003";
	  
	  System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + name.brandName);
	  System.out.println("The qty of shampoo " + name.qty);
	  System.out.println("The Type of shampoo " + name.type);
	  System.out.println("The Price of shampoo " + name.price);
	  System.out.println("The manufacturing Date of shampoo " + name.mgfDate);
	  System.out.println("The expire Date of shampoo " +name.expDate);
	  
	  Shampoo id = new Shampoo();
	  id.brandName="Moroccanoil";
	  id.type="Organic Shampoo";
	  id.price=600.54;
	  id.qty="250ml";
	  id.mgfDate="16-08-2023";
	  id.expDate="12-05-2-26";
	  
	   System.out.println("------------------------------------------");
	  System.out.println("The brandName of shampoo " + id.brandName);
	  System.out.println("The qty of shampoo " + id.qty);
	  System.out.println("The Type of shampoo " + id.type);
	  System.out.println("The Price of shampoo " + id.price);
	  System.out.println("The manufacturing Date of shampoo " + id.mgfDate);
	  System.out.println("The expire Date of shampoo " +id.expDate);
	  
	  
	  
}}
	  
 


