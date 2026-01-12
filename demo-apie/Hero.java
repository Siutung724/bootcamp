import java.util.concurrent.atomic.AtomicInteger;

// 英雄角色（用 enum，永遠不會變）
enum Role {
    WARRIOR, MAGE, ARCHER
}

// 英雄類別
public class Hero {
    // 唯一 ID（全域自動遞增）
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(1);
    private final int id;

    private final Role role;           // 角色（創建後不能改）
    private int level = 1;             // 一開始都是 1 級
    private int currentHP;
    private int currentMP;

    // 常數（根據角色和等級決定）
    private final int maxHP;
    private final int maxMP;
    private final int pa;   // Physical Attack
    private final int pd;   // Physical Defense
    private final int ma;   // Magical Attack
    private final int md;   // Magical Defense
    private final int ag;   // Agility
    private final double cc; // Critical Chance (0.0 ~ 1.0)
    private final double cd; // Critical Damage multiplier

    // 建構子：只能創建 1 級英雄
    public apie.Hero(Role role) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.role = role;

        // 根據角色設定基礎值（這裡用簡單公式，你之後可以調整）
        switch (role) {
            case WARRIOR -> {
                maxHP = 200 + level * 50;
                maxMP = 50 + level * 10;
                pa = 80 + level * 15;
                pd = 70 + level * 12;
                ma = 20 + level * 5;
                md = 40 + level * 8;
                ag = 30 + level * 5;
                cc = 0.1;                    // 暴擊率低
                cd = 2.5;                    // 暴擊傷害超高！
            }
            case MAGE -> {
                maxHP = 100 + level * 20;
                maxMP = 200 + level * 40;
                pa = 30 + level * 8;
                pd = 30 + level * 6;
                ma = 100 + level * 20;
                md = 60 + level * 10;
                ag = 20 + level * 3;
                cc = 0.2;
                cd = 1.8;
            }
            case ARCHER -> {
                maxHP = 120 + level * 30;
                maxMP = 100 + level * 20;
                pa = 60 + level * 12;
                pd = 40 + level * 8;
                ma = 40 + level * 10;
                md = 40 + level * 8;
                ag = 80 + level * 15;        // 超快！
                cc = 0.35;                   // 暴擊率最高
                cd = 1.6;
            }
        }

        // 初始血魔滿
        this.currentHP = maxHP;
        this.currentMP = maxMP;
    }

    // 升級（血魔自動回滿）
    public void levelUp() {
        level++;
        // 重新計算所有屬性（因為等級變了）
        // （這裡簡單示範，你可以把計算邏輯抽成方法）
        // ... 重新計算 maxHP, pa 等
        currentHP = maxHP;  // 血滿
        currentMP = maxMP;  // 魔滿
        System.out.println("英雄 " + id + " 升到 " + level + " 級！");
    }

    // 印出英雄資訊
    public void showStatus() {
        System.out.printf("ID:%d | 角色:%s | 等級:%d | HP:%d/%d | MP:%d/%d | PA:%d | AG:%.0f | CC:%.0f%%\n",
                id, role, level, currentHP, maxHP, currentMP, maxMP, pa, ag, cc*100);
    }

    // Getter（封裝！外面只能看，不能改）
    public int getId() { return id; }
    public Role getRole() { return role; }
    public int getLevel() { return level; }
    // ... 其他 getter

    // 測試
    public static void main(String[] args) {
        Hero h1 = new Hero(Role.WARRIOR);
        Hero h2 = new Hero(Role.MAGE);
        Hero h3 = new Hero(Role.ARCHER);

        h1.showStatus();
        h2.showStatus();
        h3.showStatus();

        h1.levelUp();
        h1.showStatus();
    }
}