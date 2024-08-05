package com.nobunagastudios.onebitrpg.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.nobunagastudios.onebitrpg.OneBitRPGGame;

/** First screen of the application. Displayed after the application is created. */
public class GameScreen implements Screen {
    private OneBitRPGGame game;
    private Texture texture;
    public GameScreen(OneBitRPGGame game){
        this.game = game;
        texture = new Texture("libgdx.png");
    }

    @Override
    public void show() {
        // Prepare your screen here.
    }

    @Override
    public void render(float delta) {
        // Draw your screen here. "delta" is the time since last render in seconds.
        ScreenUtils.clear(0.15f, 0.15f, 0.2f, 1f);
        game.batch.begin();
        game.batch.draw(texture, 140, 210);
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {
        // Resize your screen here. The parameters represent the new window size.
    }

    @Override
    public void pause() {
        // Invoked when your application is paused.
    }

    @Override
    public void resume() {
        // Invoked when your application is resumed after pause.
    }

    @Override
    public void hide() {
        // This method is called when another screen replaces this one.
    }

    @Override
    public void dispose() {
        // Destroy screen's assets here.
    }
}
