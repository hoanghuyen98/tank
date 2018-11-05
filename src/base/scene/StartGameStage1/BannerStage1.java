package base.scene.StartGameStage1;

import base.GameObject;
import base.Settings;
import base.event.KeyEventPress;
import base.renderer.SingleImageRenderer;
import base.scene.SceneManager;
import base.scene.SceneStage1;
import tklibs.SpriteUtils;

public class BannerStage1 extends GameObject {
    public BannerStage1(){
        super();
        this.renderer = new SingleImageRenderer(SpriteUtils.loadImage("assets/spaceinvader.png"));
        this.position.set(Settings.SCREEN_WIDHT / 2 , Settings.SCREEN_HEIGHT / 2);
    }

    @Override
    public void run() {
        if(KeyEventPress.isGoStageKeyPress){
            SceneManager.signNewScene(new SceneStage1());//?
        }
    }
}
