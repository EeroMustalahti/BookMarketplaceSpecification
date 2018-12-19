scenario AddAndRemovebooks of AddAndRemoveBook is 

  // action identifier mapping
  action insert_book_to_basket_1 is insert_book_to_basket( book of Book; basket of Basket; customer of Customer; system of System; )
  action customer_remove_book_from_basket_1 is customer_remove_book_from_basket( book of Book; basket of Basket; bookstore of Bookstore; customer of Customer; )
  action automatic_remove_book_from_basket_1 is automatic_remove_book_from_basket( book of Book; basket of Basket; bookstore of Bookstore; )
  action buy_book_from_basket_1 is buy_book_from_basket( book of Book; customer of Customer; basket of Basket; )
  action browse_book_1 is browse_book( customer of Customer; book of Book; bookstore of Bookstore; )
  action add_book_to_store_1 is add_book_to_store( shopkeeper of Shopkeeper; book of Book; bookstore of Bookstore; system of System; )
  action remove_book_to_store_1 is remove_book_to_store( shopkeeper of Shopkeeper; book of Book; bookstore of Bookstore; system of System; )
  action login_customer_1 is login_customer( customer of Customer; system of System; )
  action login_shopkeeper_1 is login_shopkeeper( shopkeeper of Shopkeeper; system of System; )
  action login_admin_1 is login_admin( admin of Admin; system of System; )
  action logout_customer_1 is logout_customer( customer of Customer; system of System; )
  action logout_shopkeeper_1 is logout_shopkeeper( shopkeeper of Shopkeeper; system of System; )
  action logout_admin_1 is logout_admin( admin of Admin; system of System; )
  action admin_register_shopkeeper_1 is admin_register_shopkeeper( system of System; admin of Admin; shopkeeper of Shopkeeper; bookstore of Bookstore; )
  action admin_add_new_bookstore_1 is admin_add_new_bookstore( system of System; admin of Admin; bookstore of Bookstore; )
  action admin_delete_shopkeeper_1 is admin_delete_shopkeeper( system of System; admin of Admin; shopkeeper of Shopkeeper; bookstore of Bookstore; )
  action admin_add_shopkeeper_to_bookstore_1 is admin_add_shopkeeper_to_bookstore( system of System; admin of Admin; shopkeeper of Shopkeeper; bookstore of Bookstore; )
  action search_1 is search( system of System; book of Book; bookstore of Bookstore; customer of Customer; )

  // scenario items
  login_admin_1(
    Admin_1 as admin;
    System_1 as system;
  )

  admin_register_shopkeeper_1(
    System_1 as system;
    Admin_1 as admin;
    Shopkeeper_1 as shopkeeper;
    Bookstore_1 as bookstore;
  )

  logout_admin_1(
    Admin_1 as admin;
    System_1 as system;
  )

  login_shopkeeper_1(
    Shopkeeper_1 as shopkeeper;
    System_1 as system;
  )

  add_book_to_store_1(
    Shopkeeper_1 as shopkeeper;
    Book_1_1 as book;
    Bookstore_1 as bookstore;
    System_1 as system;
  )

  add_book_to_store_1(
    Shopkeeper_1 as shopkeeper;
    Book_1_2 as book;
    Bookstore_1 as bookstore;
    System_1 as system;
  )

  add_book_to_store_1(
    Shopkeeper_1 as shopkeeper;
    Book_1_3 as book;
    Bookstore_1 as bookstore;
    System_1 as system;
  )

  logout_shopkeeper_1(
    Shopkeeper_1 as shopkeeper;
    System_1 as system;
  )

  login_shopkeeper_1(
    Shopkeeper_1 as shopkeeper;
    System_1 as system;
  )

  remove_book_to_store_1(
    Shopkeeper_1 as shopkeeper;
    Book_1_1 as book;
    Bookstore_1 as bookstore;
    System_1 as system;
  )

  remove_book_to_store_1(
    Shopkeeper_1 as shopkeeper;
    Book_1_2 as book;
    Bookstore_1 as bookstore;
    System_1 as system;
  )

end
