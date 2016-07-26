package jp.techacademy.takahiro.tominaga.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by yupon on 2016/07/25.
 */
public class Enemy extends Sprite {
    // 横幅、高さ
    public static final float STAR_WIDTH = 0.4f;
    public static final float STAR_HEIGHT = 0.4f;

    // 状態
    public static final int STAR_EXIST = 0;
    public static final int STAR_NONE = 1;

    int mEnemy;

    public Enemy(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(STAR_WIDTH, STAR_HEIGHT);
        mEnemy = STAR_EXIST;
    }

    public void get() {
        mEnemy = STAR_NONE;
        setAlpha(0);
    }
}
