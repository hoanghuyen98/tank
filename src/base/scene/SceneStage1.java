package base.scene;

import base.Background;
import base.GameObject;
import base.Settings;

import base.SoundManage;
import base.enemy.*;
import base.enemy.EnemySummoner;

import base.enemy.Enemy;

import base.enemy.EnemyType1;
import base.enemy.EnemyType2;
import base.enemy.EnemyType3;
import base.player.Tank;
import base.wall.Wall;
import base.wall.WallManagement;

import java.util.ArrayList;

public class SceneStage1 extends Scene {
    public static WallManagement arr;
    @Override
    public void destroy() {
        GameObject.clearAll();
    }

    @Override
    public void init() {
        this.tank = GameObject.recycle(Tank.class);
        tank.position.set(9*Settings.WAY_SIZE, 25*Settings.WAY_SIZE);

        this.enemyType4 = GameObject.recycle(EnemyType4.class);
        enemyType4.position.set(Settings.WAY_SIZE*1, Settings.WAY_SIZE*1);
        EnemySummoner.enemyBornManage.add(enemyType4);

        this.enemyType1 = GameObject.recycle(EnemyType1.class);
        enemyType1.position.set(Settings.WAY_SIZE*21, Settings.WAY_SIZE*5);
        EnemySummoner.enemyBornManage.add(enemyType1);

        this.enemyType3 = GameObject.recycle(EnemyType3.class);
        enemyType3.position.set(Settings.WAY_SIZE*10, Settings.WAY_SIZE*1);
        EnemySummoner.enemyBornManage.add(enemyType3);

        this.enemySummoner = GameObject.recycle(EnemySummoner.class);

        EnemySummoner.enemyNow = 3;
        EnemySummoner.enemyLeft = 6;

        Scene.sceneLeft = 1;

        arr = new WallManagement("assets\\maps\\painmap.txt" );

        String[] fileNames = {
                "level_start.wav",
                "enemy/enemy-explosion.wav",
                "enemy/hit_armor.wav",
                "player/player_explode.wav",
                "player/hit_brick.wav",
                "player/hit_wall.wav",
                "player/item-collect.wav",
                "player/player_shot.wav",
                "pause.wav",
                "enemy/enemy-explosion-big.wav",
                "player/powerup.wav"
        };
        SoundManage.loadSounds(fileNames);
        SoundManage.playSound("level_start.wav");


    }
}
