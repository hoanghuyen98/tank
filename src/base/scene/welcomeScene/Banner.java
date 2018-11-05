package base.scene.welcomeScene;

import base.GameObject;
import base.Settings;
import base.counter.FrameCounter;
import base.event.KeyEventPress;
import base.renderer.SingleImageRenderer;
import base.scene.SceneManager;
import base.scene.SceneStage1;
import base.scene.StartGameStage1.SceneImageStage1;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Banner extends GameObject {// quang thoi gian welcoameScenee ton tai

    public Banner(){
        super();
        BufferedImage image = SpriteUtils.loadImage("assets/406x228bb.jpg");
        this.renderer = new SingleImageRenderer(image);
        this.position.set((Settings.SCREEN_WIDHT) / 2 ,
                (Settings.SCREEN_HEIGHT) / 2);
    }

    @Override
    public void run() {
        if(KeyEventPress.isAnyKeyPress){
            SceneManager.signNewScene(new SceneImageStage1());
        }
       /* if(KeyEventPress.isAnyKeyPress && !KeyEventPress.isGoStageKeyPress  ){
            SceneManager.signNewScene(new SceneImageStage1());
        }*/
    }
}
