package kata.paginationhelper;

import java.util.ArrayList;
import java.util.List;

public class PaginationHelper<I> {
    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    List<I> pages;
    int itemsPerPage;

    int item_count;
    int items_per_page;
    int page_count;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        pages = new ArrayList<>(collection);
        this.itemsPerPage = itemsPerPage;

    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return pages.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        int numPages = 0;
        numPages = (itemCount() / itemsPerPage);
        if(itemCount() % itemsPerPage != 0) numPages++;
        return numPages;
    }

     /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {

        if(pageIndex > pageCount() || pageIndex < 1) return -1;

        if(pageIndex != pageCount()) {
            return itemsPerPage;
        } else { return itemCount() % itemsPerPage;
        }
    }

    public int pageItemCountBetter(int pageIndex) {
        if (pageIndex < 0 || pageIndex >= pageCount())
            return -1;
        else if (pageIndex == pageCount() - 1)
            return itemCount() % itemsPerPage;
        else
            return itemsPerPage;
    }


    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {

        if(itemIndex > pages.size() || itemIndex < 1) return -1;
        int pageNumber = 0;
        for(int i = 0; i < pageCount(); i++)
            if (itemIndex <= itemsPerPage + (pageNumber * itemsPerPage)) return pageNumber + 1;
            else pageNumber++;

        return 0;
    }



    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndexBetter(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= itemCount())
            return -1;
        else
            return itemIndex / itemsPerPage;
    }

}
