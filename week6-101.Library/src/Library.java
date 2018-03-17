/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omuntean
 */
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    
    public Library(){
        this.books = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook){
        this.books.add(newBook);
    }
    
    public void printBooks(){
        for(Object i : this.books){
            System.out.println(i);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book book : this.books){
            if(StringUtils.included(book.title(), title)){
                found.add(book);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book book : this.books){
            if(StringUtils.included(book.publisher(), publisher)){
                found.add(book);
            }
        }
        
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(int i = 0; i < this.books.size(); i++){
            if(this.books.get(i).year() == year){
                found.add(this.books.get(i));
            }
        }
        
        return found;
    }
}
