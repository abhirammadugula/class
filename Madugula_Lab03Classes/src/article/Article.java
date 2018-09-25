/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package article;

/**
 *
 * @author Abhiram, Madugula
 */
public class Article {

    /** Responsible for Article App code implementation
     * @param args the command line arguments
     */
        private String authorName;
        private String title;
        private String journal;
        private int volume;
        private int issue;
        private int year;
        private String pages;
        private String doi;

    //5.a
    public Article(String authorName, String title, String journal, int volume, int issue, int year, String pages, String doi) {
      /**Parameterized Constructor for Article class
     * @param authorName
     * @param title
     * @param journal
     * @param volume
     * @param issue
     * @param year
     * @param pages
     * @param doi
     */
        this.authorName = authorName;
        this.title = title;
        this.journal = journal;
        this.volume = volume;
        this.issue = issue;
        this.year = year;
        this.pages = pages;
        this.doi = doi;
    }

    //5.b
    public Article() {
     /** No argument Constructor for Article class
     */
    }
        
    //6.a

    public String getAuthorName() {
     /**Function to fetch author name of Article class
     */
        return authorName;
    }

    public String getTitle() {
      /**Function to fetch title of Article class
     */
        return title;
    }

    public String getJournal() {
    /**Function to fetch journal of Article class
     */
        return journal;
    }

    public int getVolume() {
     /**Function to fetch volume of Article class
     */
        return volume;
    }

    public int getIssue() {
     /**Function to fetch issue of Article class
     */
        return issue;
    }

    public int getYear() {
     /**Function to fetch year of Article class
     */
        return year;
    }

    public String getPages() {
     /**Function to fetch pages of Article class
     */
        return pages;
    }

    public String getDoi() {
     /**Function to fetch doi of Article class
     */
        return doi;
    }

    public void setAuthorName(String authorName) {
     /**Function to fetch author name of Article class
      * @param authorName
     */
        this.authorName = authorName;
    }

    public void setTitle(String title) {
     /**Function to fetch title of Article class
      * @param title
     */
        this.title = title;
    }

    public void setJournal(String journal) {
     /**Function to fetch journal of Article class
      * @param journal
     */
        this.journal = journal;
    }

    public void setVolume(int volume) {
     /**Function to fetch volume of Article class
      * @param volume
     */
        this.volume = volume;
    }

    public void setIssue(int issue) {
     /**Function to fetch journal of Article class
      * @param issue
     */
        this.issue = issue;
    }

    public void setYear(int year) {
     /**Function to fetch year of Article class
      * @param year
     */
        this.year = year;
    }

    public void setPages(String pages) {
     /**Function to fetch pages of Article class
      * @param pages
     */
        this.pages = pages;
    }

    public void setDoi(String doi) {
     /**Function to fetch doi of Article class
      * @param doi
     */
        this.doi = doi;
    }

    //6.b
    public String getFormattedPageNumbers(){
     /**Function to get formatted page numbers in the form startingpage-endingpage
     */
        return pages.substring(pages.indexOf(":") + 1, pages.indexOf(",")).concat("-").concat(pages.substring(pages.lastIndexOf(":")+1));
       }
    //6.c
    public String getArticleDetails(){
     /**Function to get Article details
     */
        return journal.concat(",").concat(" ").concat(Integer.toString(volume)).concat("(").concat((Integer.toString(issue)).concat("), ").concat(getFormattedPageNumbers()).concat(",")).concat("doi:").concat(doi);
    }
    //6.d
    public void replaceArticleTitle(String oldTitle, String newTitle){
     /**Function to replace old title with new title
      * @param oldTitle
      * @param newTitle
     */
        title = title.replace(oldTitle, newTitle);
    }
    //6.e
    public String getLastNameOfAuthor(){
     /**Function to fetch last name of Author
     */
        return authorName.substring(authorName.lastIndexOf(" ")+1);
    }
    //6.f
    public String getFirstInitialOfAuthor(){
     /**Function to fetch first initial name of Author
     */
        return authorName.substring(0, 1);
    }
    //6.g
    public String getMiddleInitialOfAuthor(){
     /**Function to fetch middle initial of Author
     */
        return authorName.substring(authorName.indexOf(" ")+1, authorName.indexOf(" ")+2);
    }
    
    //6.h
    @Override
    public String toString() {
        /**Function for string representation of object
     */
        return getLastNameOfAuthor() + ", " + getFirstInitialOfAuthor() + ". " + getMiddleInitialOfAuthor() + ". (" + year + "). " + title + ", " + journal + ", " + volume + "(" + issue + "), " + getFormattedPageNumbers() + ". doi:" + doi;
    }
    
    
 
}
    
