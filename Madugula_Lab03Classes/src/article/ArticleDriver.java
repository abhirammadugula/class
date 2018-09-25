/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package article;

import java.util.Scanner;

/**
 *
 * @author Abhiram, Madugula
 */
public class ArticleDriver {

    /** The controller class for Article
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1
        System.out.println("Testing the Article Class");
        //2
        Article article1 = new Article("Jeannette Marie Wing", "Computational Thinkings Influence on Research and Education for All", "Italian Journal on Educational Technology (formerly TD Tecnologie Didattiche)", 25, 2, 2017, "from:7, to:14", "10.17471/2499-4324/922");
        //3
        System.out.println("Testing the Getter methods or Accessors of Article Class");
        //4
        System.out.println("Author: " + article1.getAuthorName());
        System.out.println("Article Title: " + article1.getTitle());
        System.out.println("Journal: " + article1.getJournal());
        System.out.println("Volume of Journal: " + article1.getVolume());
        System.out.println("Issue of Journal: " + article1.getIssue());
        System.out.println("Year of Publication: " + article1.getYear());
        System.out.println("Pages: " + article1.getPages());
        System.out.println("DOI: " + article1.getDoi());
        //5
        System.out.println("Testing the toString method");
        //6
        System.out.println(article1.toString());
        //7
        System.out.println("Testing the user defined methods");
        //8
        System.out.println(article1.getFirstInitialOfAuthor());
        //9
        System.out.println(article1.getMiddleInitialOfAuthor());
        //10
        System.out.println(article1.getLastNameOfAuthor());
        //11
        article1.replaceArticleTitle("Thinkings", "Thinking's");
        //12
        System.out.println("Printing the artice1 object after invoking the replace method");
        //13
        System.out.println(article1.toString());
        //14
        Article article2 = new Article();
        //15
        System.out.println("Testing the Getter methods or Accessors of Article Class with no-arg constructor");
        //16
        System.out.println("Author: " + article2.getAuthorName());
        System.out.println("Article Title: " + article2.getTitle());
        System.out.println("Journal: " + article2.getJournal());
        System.out.println("Volume of Journal: " + article2.getVolume());
        System.out.println("Issue of Journal: " + article2.getIssue());
        System.out.println("Year of Publication: " + article2.getYear());
        System.out.println("Pages: " + article2.getPages());
        System.out.println("DOI: " + article2.getDoi());
        //17
        article2.setAuthorName("Donald Ervin Knuth");
        //18
        article2.setTitle("Mathematics and Computer Science: Coping with Finiteness");
        //19
        article2.setJournal("Science");
        //20
        article2.setVolume(194);
        //21
        article2.setIssue(4271);
        //22
        article2.setYear(1976);
        //23
        article2.setPages("from:1235, to:1242");
        //24
        article2.setDoi("10.1126/science.194.4271.1235");
        //25
        System.out.println("Testing the Article class using toString after invoking the Setter methods or Mutators");
        //26
        System.out.println(article2.toString());
        //27
        System.out.println("Testing the Scanner class to take input from the console");
        //28
        Scanner scannerObject = new Scanner(System.in);
        //29
        System.out.println("Enter the article details");
        System.out.println("Enter the title of the article:");
        String title = scannerObject.nextLine();
        System.out.println("Enter the author name:");
        String authorName = scannerObject.nextLine();
        System.out.println("Enter the Journal name:");
        String journal = scannerObject.nextLine();
        System.out.println("Enter the Journal volume, issue, year, starting page number, ending page number, doi in one line without any commas:");
        int volume = scannerObject.nextInt();
        int issue = scannerObject.nextInt();
        int year = scannerObject.nextInt();
        int startingPageNumber = scannerObject.nextInt();
        int endingPageNumber = scannerObject.nextInt();
        String pages = "from:".concat(Integer.toString(startingPageNumber)).concat(", to:").concat(Integer.toString(endingPageNumber));
        String doi = scannerObject.nextLine();
        //30
        Article article3 = new Article(authorName, title, journal, volume, issue, year, pages, doi);
        //31
        System.out.println("Testing the toString method without invoking the method");
        //32
        System.out.println(article3);
    }

}
