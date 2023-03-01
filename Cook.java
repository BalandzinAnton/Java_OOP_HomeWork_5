package OOP.HW.HW_5;

public class Cook implements Worker{

  @Override
  public void searchWorker() {
    //находим работника
    System.out.println("Подбираем повара...");
  }

  @Override
  public void drawUpWorker() {
    //оформляем работника
    System.out.println("Проверяем санитарную книгу\n"
        + "Оформляем повара...");
  }
}
