package oop.this_;

public class Player {
    String nickname;
    int level;
    int hp;

    public Player() {
        System.out.println("기본 생성자 호출!");
        level = 1;
        hp = 50;
    }

    public Player(String nickname) {
        this.nickname = nickname;
    }

    public Player(String nickname, int level, int hp){
        this.nickname = nickname;
        this.level = level;
        this.hp = hp;
    }

    void characterInfo(){
        System.out.println("*** 캐릭터의 정보 ***");
        System.out.println("nickname = " + nickname);
        System.out.println("level = " + level);
        System.out.println("hp = " + hp);
    }

}
