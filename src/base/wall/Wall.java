package base.wall;

import base.GameObject;
import base.Settings;
import base.physics.BoxCollider;
import base.physics.Physics;
import base.renderer.BoxColliderRenderer;
import base.renderer.SingleImageRenderer;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Wall extends GameObject implements Physics {
    BoxCollider collider;
    public Wall(){
//        BufferedImage imageBrick = SpriteUtils.loadImage("assets/maps/item_built_map/BricksOrig.png");
//        this.renderer = new SingleImageRenderer(imageBrick);
//        this.renderer = new BoxColliderRenderer(Color.WHITE,true);
        this.collider = new BoxCollider(Settings.WAY_SIZE,Settings.WAY_SIZE);
    }
    @Override
    public BoxCollider getBoxCollider() {
        return this.collider;
    }
}
