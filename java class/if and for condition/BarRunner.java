class BarRunner{
public static void main(String brandName[]){

boolean brands=Bar.addWineBrands("Robert Mondavi");
System.out.println("The brand names are" +brands);


brands=Bar.addWineBrands("Yellow Tail");
System.out.println("The brand names are" +brands);

brands=Bar.addWineBrands("Barefoot");
System.out.println("The brand names are" +brands);

brands=Bar.addWineBrands("Kendall-Jackson");
System.out.println("The brand names are" +brands);

brands=Bar.addWineBrands("Sutter Home");
System.out.println("The brand names are" +brands);

brands=Bar.addWineBrands("Franzia");
System.out.println("The brand names are" +brands);

brands=Bar.addWineBrands("Penfolds");
System.out.println("The brand names are" +brands);

brands=Bar.addWineBrands("La Crema");
System.out.println("The brand names are" +brands);

brands=Bar.addWineBrands("Louis Jadot");
System.out.println("The brand names are" +brands);

brands=Bar.addWineBrands("Gallo Family Vineyards");
System.out.println("The brand names are" +brands);

brands=Bar.addWineBrands("Ruffino");
System.out.println("The brand names are" +brands);

brands=Bar.addWineBrands("Veuve Clicquot");
System.out.println("The brand names are" +brands);

brands=Bar.addWineBrands("Moët & Chandon");
System.out.println("The brand names are" +brands);

brands=Bar.addWineBrands("Gallo Family Vineyards");
System.out.println("The brand names are" +brands);

brands=Bar.addWineBrands("Caymus");
System.out.println("The brand names are" +brands);

Bar.getAllBrands();


boolean updatedName = Bar.updateWineBrands("Caymus","RedWine");
System.out.println("The updated names are" +updatedName);
Bar.getAllBrands();
boolean deletedBrand = Bar.deletedWineBrand("Ruffino");
System.out.println("The deleted Brand are "+deletedBrand);

Bar.getAllBrands();

}
}