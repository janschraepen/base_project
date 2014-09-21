"As a ... I want to ... so that ..."


TODO
====

1. 22% Tax

   AS A dealer
   I WANT TO see the price incl. 22% tax next to the current tax
   SO THAT in my list overview it's clear what the future selling price will be.

   Make changes so that the price incl 22% tax is shown next to the current price incl 21% tax. Therefor
   make the needed changes to service / view.

2. Add "description", "x", "y" field to Product

   AS A dealer
   I WANT TO have extra fields available for a product
   SO THAT a product could have a description, x and y

   Therefor make the needed changes to sql / POJO / repository / service / view

3. create "overview" page.. with product blocks (4 in a row)

   AS A dealer
   I WANT TO have an overview page (4 items in a row)
   SO THAT all products can be shown next to each other in a proper overview.

   Create another page "overview', next to the existing list, detail pages.

   Forsee 4 product blocks next to each other. Each row should display 4 products. Each product should
   display the title (bold, font-size 24pt) an image (100px x 100px) and the description (font-size 11pt).

4. Make "overview" page responsive

   AS A dealer
   I WANT TO have the overview page made responsive
   SO THAT it could be displayed on all devices

   Make sure the page is displayed correctly on iPad: the same principle should be applied as the normal
   overview page, except use smaller images (40px x 40px) and hide the description.

   Make sure the page is displayed correctly on iPhone: show all items on a different row. Showing the title
   and an image (adjusted to page).

5. Refactor "list"/"detail" page

   AS A dealer
   I WANT TO make use of the shortCode in stead of the uuid to open a product detail
   SO THAT the uri shows the productCode.

   Therefor make the needed changes to controller / jsp

7. Fix multiple select bug

   AS A dealer
   I WANT TO be able to only select 1 product
   SO THAT the NullPointerException doesn't occur when trying to access the detail page having 2 (or more) product selected.

   Reproduct bug by:
   Go to list page.. select 2 (or more) products. Click view.

   A NullPointerException occurs. Forsee the possibility to only select one item at a time.

8. Save new / Update Product

   AS A dealer
   I WANT TO be able to add new products using the web interface
   SO THAT new products could be added easily.

   Forsee in the needed repository / service methods to save a new/update a product.

   Update detail page so that the form can be used to save new/update a product. Make needed changes to controller.