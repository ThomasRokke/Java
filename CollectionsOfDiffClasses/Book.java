
public class Book{

    int ISBN; 
    String title;
    String author;
    int publishYear;
    int copies;
    int copiesStock;

    public Book(){
        this(123,"hei","Forfatter",2001,2,3);

    }
    
     public Book(int ISBN, String title, String author, int publishYear, int copies, int copiesStock){
        setISBN(ISBN);
        setTitle(title);
        setAuthor(author);
        setPublishYear(publishYear);
        setCopies(copies);
        setCopiesStock(copiesStock); 
    }

   
    
    public String bookInfo(){
        String toString;
        toString = ISBN + " "+author+ " "+title+" "+publishYear+" "+"( Copies in: "+copiesStock+")"; 
        return toString;
    }
    
    
    
    public void bookReturn(){
        if(copies == copiesStock){
            System.out.println("No books have ben lent out"); 
        }
        else{
            copiesStock++;
        }
    }
    
    public void bookLoan(){
        if(copiesStock > 0){
            copiesStock = copiesStock - 1; 
        }
        if(copiesStock == 1){
            System.out.println("Just one copy in stock"); 
        }
        else{
            System.out.println("I am sorry, the book is not avaible"); 
        }
    }
    
    
    public void setISBN(int ISBN){
        this.ISBN = ISBN; 
    }
    
    public int getISBN(){
        return ISBN;
    }
   
    public void setTitle(String title){
        this.title = title; 
    }
    
    public String getTitle(){
        return title; 
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getAuthor(){
        return author; 
    }
   
    public void setPublishYear(int publishYear){
        this.publishYear = publishYear;
    }
    
    public int getPublishYear(){
        return publishYear;
    }
    
    public void setCopies(int copies) {
        this.copies = copies; 
    }
    
    public int getCopies(){
        return copies; 
    }
    
    public void setCopiesStock(int copiesStock) {
        this.copiesStock = copiesStock; 
    }
    
    public int getCopiesStock(){
        return copiesStock;
    }
}
