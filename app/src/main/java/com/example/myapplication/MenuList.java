package com.example.myapplication;

import java.util.ArrayList;

public class MenuList {
    ArrayList<MenuDTO> menuList =new ArrayList<>();

    public void baseList(){
        //이름, 정보,종류,가격,수량,src
        menuList.add(new MenuDTO("아몬드","맛있는 아몬드","견과류",500,30,"@drawable/almonds"));
        menuList.add(new MenuDTO("초록 사과","맛있는 초록 사과","과일",1500,60,"@drawable/apple_green"));
        menuList.add(new MenuDTO("사과","맛있는 사과","과일",1500,45,"@drawable/apple_red"));
        menuList.add(new MenuDTO("황금 사과","맛있는 황금 사과","과일",1500,40,"@drawable/apple_yellow"));
        menuList.add(new MenuDTO("아스파라거스","맛있는 아스파라거스","채소",200,150,"@drawable/asparagus"));
        menuList.add(new MenuDTO("아보카도","맛있는 아보카도","과일",250,10,"@drawable/avocado_half"));
        menuList.add(new MenuDTO("베이컨","맛있는 베이컨","육류",2200,130,"@drawable/bacon"));
        menuList.add(new MenuDTO("베이글","맛있는 베이글","제과류",2500,60,"@drawable/bagel"));
        menuList.add(new MenuDTO("바게트","맛있는 바게트","제과류",2500,60,"@drawable/baguette"));
        menuList.add(new MenuDTO("바나나","맛있는 바나나","과일",1500,130,"@drawable/banana"));
        menuList.add(new MenuDTO("파프리카","맛있는 파프리카","채소",400,130,"@drawable/bell_pepper_red"));
        menuList.add(new MenuDTO("녹색 파프리카","맛있는 녹색 파프리카","채소",400,130,"@drawable/bell_pepper_green"));
        //아 귀찮아ㅏㅏㅏ
        menuList.add(new MenuDTO("노란 파프리카","노란 파프리카","채소",400,130,"@drawable/bell_pepper_yellow"));
        menuList.add(new MenuDTO("블루베리","맛있는 블루베리","과일",500,50,"@drawable/blueberries"));
        menuList.add(new MenuDTO("갈색 식빵","맛있는 갈색 식빵","제과류",500,30,"@drawable/bread_loaf_brown"));
        menuList.add(new MenuDTO("식빵","맛있는 식빵","제과류",500,30,"@drawable/bread_loaf_white"));
        menuList.add(new MenuDTO("뿌링클 치킨","과거부터 현재까지 전 국민.. 아니 전 세계의 식욕을 불러일으켰던 마의 음식이다. 현재 합법적으로 섭취할 수 있는 유일한 마약이다.","치킨",500000,100,"@drawable/chicken_drumstick_raw"));
    }
    public void sellMenu(int index, int amount) {
        menuList.get(index).sellGoods(amount);
    }
    public void addMenu(MenuDTO menu) {
        menuList.add(menu);
    }

    public void removeMenu(MenuDTO menu) {
        menuList.remove(menu);
    }

}
