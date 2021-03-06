package com.todo.menu;
public class Menu {

    public static void displaymenu()
    {
        System.out.println();
        System.out.println("< 메뉴 및 명령어 안내 >");
        System.out.println("1. 새로운 항목 추가 : add");
        System.out.println("2. 기존 항목 삭제 : del");
        System.out.println("3. 다중 항목 삭제 : del_multi");
        System.out.println("4. 기존 항목 수정 : edit");
        System.out.println("5. 기존 항목 완료 : comp <index>");
        System.out.println("6. 다중 항목 완료 : comp_multi");
        System.out.println("7. 완료된 항목 활동 시간 입력하기 : comp_time");
        System.out.println("8. 전체 항목 보기 : ls");
        System.out.println("9. 카테고리 목록 보기 : ls_cate");
        System.out.println("10. 이름 순으로 정렬 : ls_name_asc");
        System.out.println("11. 이름 역순으로 정렬 : ls_name_desc");
        System.out.println("12. 시간 순으로 정렬 : ls_date");
        System.out.println("13. 시간 역순으로 정렬 : ls_date_desc");
        System.out.println("14. 중요도 순으로 정렬 : ls_imp");
        System.out.println("15. 완료된 항목 보기 : ls_comp");
        System.out.println("16. 마감기한 보기 : ls_todo <date>");
        System.out.println("17. 카테고리 별 활동 시간 보기 : ls_cate_time");
        System.out.println("18. 키워드로 검색 : find <keyword>");
        System.out.println("19. 카테고리 키워드로 검색 : find_cate <keyword>");
        System.out.println("20. 성취도 보기 : perform");
        System.out.println("21. 종료 : exit (Or press escape key)");
        
    }
    
    public static void prompt() {
    	System.out.print("\n명령어를 입력해 주세요. > ");
    }
    
    
}
