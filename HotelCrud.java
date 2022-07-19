interface HotelCrud{

  boolean createFoodItem(FoodItemDto dto);
  void getFoodItem();
  boolean updatePriceById(int id,double price);
  boolean updateIsAvailableByName(String name,boolean isAvailable);
  boolean deleteFoodItemDetailsById(int id);
  boolean deleteFoodItemDetailsByName(String name);
  boolean updateFoodPriceByName(String name,double price);
  String[] getAllFoodNames();
  boolean deleteFoodTypeById(int id);
  boolean deleteFoodItemByType(String type);

}