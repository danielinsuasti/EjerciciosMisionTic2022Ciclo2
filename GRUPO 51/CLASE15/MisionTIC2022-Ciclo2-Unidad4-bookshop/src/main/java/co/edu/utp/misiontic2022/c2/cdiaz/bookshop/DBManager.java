package co.edu.utp.misiontic2022.c2.cdiaz.bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBManager implements AutoCloseable {
    private Connection connection;

    public DBManager() throws SQLException {
        connect();
    }

    private void connect() throws SQLException {
        String url = "jdbc:sqlite:BookShop.db";
        
        connection = DriverManager.getConnection(url);        
    }

    /**
     * Close the connection to the database if it is still open.
     *
     */
    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
        connection = null;
    }

     /**
     * Return the number of units in stock of the given book.
     *
     * @param book The book object.
     * @return The number of units in stock, or 0 if the book does not
     *         exist in the database.
     * @throws SQLException If somthing fails with the DB.
     */
    public int getStock(Book book) throws SQLException {
        return getStock(book.getId());
    }

    /**
     * Return the number of units in stock of the given book.
     *
     * @param bookId The book identifier in the database.
     * @return The number of units in stock, or 0 if the book does not
     *         exist in the database.
     */
    public int getStock(int bookId) throws SQLException {
        // TODO: program this method
        int response =0;

        try(var stmt = connection.prepareStatement("SELECT * FROM stock WHERE book_id = ?")){
            stmt.setInt(1, bookId);
            try(var rset = stmt.executeQuery()){
                if(rset.next()){
                    response = rset.getInt("amount");
                }
            }

        }
        return response;
    }

    /**
     * Search book by ISBN.
     *
     * @param isbn The ISBN of the book.
     * @return The Book object, or null if not found.
     * @throws SQLException If somthing fails with the DB.
     */
    public Book searchBook(String isbn) throws SQLException {

        Book book = null;
        Statement stmt = null;
        ResultSet rset = null;

        try{
            stmt =connection.createStatement();
            rset = stmt.executeQuery("SELECT * FROM Book WHERE isbn = '"+isbn+"'");
            if(rset.next()){
                book = new Book();
                book.setId(rset.getInt("id"));
                book.setTitle(rset.getString("title"));
                book.setIsbn(rset.getString("isbn"));
                book.setYear(rset.getInt("year"));
            }

        }finally{         //PROQUE NO HAY CATCH??, "no captura la exepcion"
            if(rset != null){
                rset.close();
            }
            if(stmt != null){
                stmt.close();
            }
        }
        return book;

    }

    /**
     * Sell a book.
     *
     * @param book The book.
     * @param units Number of units that are being sold.
     * @return True if the operation succeeds, or false otherwise
     *         (e.g. when the stock of the book is not big enough).
     * @throws SQLException If somthing fails with the DB.
     */
    public boolean sellBook(Book book, int units) throws SQLException {
        return sellBook(book.getId(), units);
    }

    /**
     * Sell a book.
     *
     * @param book The book's identifier.
     * @param units Number of units that are being sold.
     * @return True if the operation succeeds, or false otherwise
     *         (e.g. when the stock of the book is not big enough).
     * @throws SQLException If something fails with the DB.
     */
    public boolean sellBook(int book, int units) throws SQLException {
        // TODO: program this method
        return false;
    }

    /**
     * Return a list with all the books in the database.
     *
     * @return List with all the books.
     * @throws SQLException If something fails with the DB.
     */
    public List<Book> listBooks() throws SQLException {
        List<Book> response = new ArrayList<Book>();

        try(var stmt = connection.prepareStatement("SELECT * FROM Book");
            var rset = stmt.executeQuery()){
                while(rset.next()){
                    var book = new Book();
                    book.setId(rset.getInt("id"));
                    book.setTitle(rset.getString("title"));
                    book.setIsbn(rset.getString("isbn"));
                    book.setYear(rset.getInt("year"));
                    
                    response.add(book);
                }
        }

        //return new ArrayList<Book>();
        return response;
    }
}
