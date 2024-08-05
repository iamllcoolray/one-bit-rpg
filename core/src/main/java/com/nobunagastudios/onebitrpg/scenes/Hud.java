package com.nobunagastudios.onebitrpg.scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.nobunagastudios.onebitrpg.OneBitRPGGame;

public class Hud {
    public Stage stage;
    private Viewport viewport;
    private int worldTime;
    private float timeCount;
    private int score;
    Label countLabel;
    Label scoreLabel;
    Label timeLabel;
    Label areaLabel;
    Label mapLabel;
    Label adventurerLabel;

    public Hud(SpriteBatch batch){
        worldTime = 0;
        timeCount = 2400;
        score = 0;

        viewport = new FitViewport(OneBitRPGGame.V_WIDTH, OneBitRPGGame.V_HEIGHT, new OrthographicCamera());
        stage = new Stage(viewport, batch);

        Table table = new Table();
        table.top();
        table.setFillParent(true);

        countLabel = new Label(String.format("%04d", worldTime), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        scoreLabel = new Label(String.format("%06d", score), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        timeLabel = new Label("TIME", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        areaLabel = new Label("Level 1", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        mapLabel = new Label("MAP", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        adventurerLabel = new Label("ADVENTURER", new Label.LabelStyle(new BitmapFont(), Color.WHITE));

        table.add(adventurerLabel).expandX().pad(10);
        table.add(mapLabel).expandX().pad(10);
        table.add(timeLabel).expandX().pad(10);
        table.row();
        table.add(scoreLabel).expandX();
        table.add(areaLabel).expandX();
        table.add(countLabel).expandX();

        stage.addActor(table);
    }
}
