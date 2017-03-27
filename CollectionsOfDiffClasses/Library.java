public class Library{
    public Library(){

    }

    public void mainMethod(){
        Book bok1 = new Book(12345678, "Død snø", "Jo Nesbø", 2010, 2, 2); 
        Book bok2 = new Book(12325678, "Dd sø", "Jo Nesbø", 2030, 30, 5); 
        Book bok3 = new Book(12345678, "ød sø", "Jo Nesbsdf", 2030, 30, 6); 
        Book bok4 = new Book(12352678, "ød ø", "Jo Nesdfssbø", 2053, 30, 5); 
        Book bok5 = new Book(12352678, "Dø sø", "Jo Nesfdfsbø", 2020, 30, 7); 
        Book bok6 = new Book(12355235, "Død snø", "Jo Nsfesbø", 2010, 30, 2);

        System.out.println("Get's a copy of the book: "+bok1.bookInfo()); 
        bok1.bookLoan();
        bok1.bookInfo(); 
        
        System.out.println("Get's a copy of the book: "+bok1.bookInfo()); 
        bok1.bookLoan();
        bok1.bookInfo(); 
        
        System.out.println("Return the book: "+bok1.bookInfo()); 
        bok1.bookReturn();
        bok1.bookInfo(); 
        
        System.out.println("Return the book: "+bok1.bookInfo()); 
        bok1.bookReturn();
        bok1.bookInfo(); 
        
        System.out.println("Return the book: "+bok1.bookInfo()); 
        bok1.bookReturn();
        bok1.bookInfo(); 
        
       

    }

}