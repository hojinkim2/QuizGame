package quizGame;

/*
 * 0. Main.java ->실행
 * 1. QuizGame.java -> 시작 화면 
 * 2. startGame.java -> 장르 선택
 * 3. sideScene.java -> 시작 전 잠깐, 인트로+ 준비 화면
 * 4. OnGame.java -> 퀴즈 게임 
 * 5. gameEnding.java -> 게임이 끝났을 때 화면   
 * */
public class Main {
    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 720;
    public static int Now_QuizNum = 1;
    public static int Game_Score = 0;
    public static int Remain_Question = 10;
    public static int Life_Remain = 10;

    public static void main(String[] args) {
        new QuizGame();
    }

}
