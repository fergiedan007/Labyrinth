package com.ru.tgra.shapes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.utils.BufferUtils;
import com.ru.tgra.models.CubeMask;

import java.nio.FloatBuffer;

public class BoxGraphic {

	private static FloatBuffer vertexBuffer;
	private static FloatBuffer normalBuffer;
	private static int vertexPointer;
	private static int normalPointer;

	public static void create(int vertexPointer, int normalPointer) {
		BoxGraphic.vertexPointer = vertexPointer;
		BoxGraphic.normalPointer = normalPointer;
		//VERTEX ARRAY IS FILLED HERE
		float[] vertexArray = {-0.5f, -0.5f, -0.5f,
						-0.5f, 0.5f, -0.5f,
						0.5f, 0.5f, -0.5f,
						0.5f, -0.5f, -0.5f,
						-0.5f, -0.5f, 0.5f,
						-0.5f, 0.5f, 0.5f,
						0.5f, 0.5f, 0.5f,
						0.5f, -0.5f, 0.5f,
						-0.5f, -0.5f, -0.5f,
						0.5f, -0.5f, -0.5f,
						0.5f, -0.5f, 0.5f,
						-0.5f, -0.5f, 0.5f,
						-0.5f, 0.5f, -0.5f,
						0.5f, 0.5f, -0.5f,
						0.5f, 0.5f, 0.5f,
						-0.5f, 0.5f, 0.5f,
						-0.5f, -0.5f, -0.5f,
						-0.5f, -0.5f, 0.5f,
						-0.5f, 0.5f, 0.5f,
						-0.5f, 0.5f, -0.5f,
						0.5f, -0.5f, -0.5f,
						0.5f, -0.5f, 0.5f,
						0.5f, 0.5f, 0.5f,
						0.5f, 0.5f, -0.5f};

		vertexBuffer = BufferUtils.newFloatBuffer(72);
		vertexBuffer.put(vertexArray);
		vertexBuffer.rewind();

		//NORMAL ARRAY IS FILLED HERE
		float[] normalArray = {0.0f, 0.0f, -1.0f,
							0.0f, 0.0f, -1.0f,
							0.0f, 0.0f, -1.0f,
							0.0f, 0.0f, -1.0f,
							0.0f, 0.0f, 1.0f,
							0.0f, 0.0f, 1.0f,
							0.0f, 0.0f, 1.0f,
							0.0f, 0.0f, 1.0f,
							0.0f, -1.0f, 0.0f,
							0.0f, -1.0f, 0.0f,
							0.0f, -1.0f, 0.0f,
							0.0f, -1.0f, 0.0f,
							0.0f, 1.0f, 0.0f,
							0.0f, 1.0f, 0.0f,
							0.0f, 1.0f, 0.0f,
							0.0f, 1.0f, 0.0f,
							-1.0f, 0.0f, 0.0f,
							-1.0f, 0.0f, 0.0f,
							-1.0f, 0.0f, 0.0f,
							-1.0f, 0.0f, 0.0f,
							1.0f, 0.0f, 0.0f,
							1.0f, 0.0f, 0.0f,
							1.0f, 0.0f, 0.0f,
							1.0f, 0.0f, 0.0f};


		normalBuffer = BufferUtils.newFloatBuffer(72);
		normalBuffer.put(normalArray);
		normalBuffer.rewind();
	}

	public static void drawSolidCube()
	{

		Gdx.gl.glVertexAttribPointer(vertexPointer, 3, GL20.GL_FLOAT, false, 0, vertexBuffer);
		Gdx.gl.glVertexAttribPointer(normalPointer, 3, GL20.GL_FLOAT, false, 0, normalBuffer);

		Gdx.gl.glDrawArrays(GL20.GL_TRIANGLE_FAN, 0, 4);
		Gdx.gl.glDrawArrays(GL20.GL_TRIANGLE_FAN, 4, 4);
		Gdx.gl.glDrawArrays(GL20.GL_TRIANGLE_FAN, 8, 4);
		Gdx.gl.glDrawArrays(GL20.GL_TRIANGLE_FAN, 12, 4);
		Gdx.gl.glDrawArrays(GL20.GL_TRIANGLE_FAN, 16, 4);
		Gdx.gl.glDrawArrays(GL20.GL_TRIANGLE_FAN, 20, 4);
	}

    public static void drawSolidCube(CubeMask mask)
    {

        Gdx.gl.glVertexAttribPointer(vertexPointer, 3, GL20.GL_FLOAT, false, 0, vertexBuffer);
        Gdx.gl.glVertexAttribPointer(normalPointer, 3, GL20.GL_FLOAT, false, 0, normalBuffer);

        // North
        if (mask.isWest())
        {
            Gdx.gl.glDrawArrays(GL20.GL_TRIANGLE_FAN, 0, 4);
        }

        // South
        if (mask.isEast())
        {
            Gdx.gl.glDrawArrays(GL20.GL_TRIANGLE_FAN, 4, 4);
        }

        // Bottom
        if (mask.isBottom())
        {
            Gdx.gl.glDrawArrays(GL20.GL_TRIANGLE_FAN, 8, 4);
        }

        // Top
        if (mask.isTop())
        {
            Gdx.gl.glDrawArrays(GL20.GL_TRIANGLE_FAN, 12, 4);
        }

        // West
        if (mask.isSouth())
        {
            Gdx.gl.glDrawArrays(GL20.GL_TRIANGLE_FAN, 16, 4);
        }

        // East
        if (mask.isNorth())
        {
            Gdx.gl.glDrawArrays(GL20.GL_TRIANGLE_FAN, 20, 4);
        }
    }

	public static void drawOutlineCube() {

		Gdx.gl.glVertexAttribPointer(vertexPointer, 3, GL20.GL_FLOAT, false, 0, vertexBuffer);
		Gdx.gl.glVertexAttribPointer(normalPointer, 3, GL20.GL_FLOAT, false, 0, normalBuffer);
		
		Gdx.gl.glDrawArrays(GL20.GL_LINE_LOOP, 0, 4);
		Gdx.gl.glDrawArrays(GL20.GL_LINE_LOOP, 4, 4);
		Gdx.gl.glDrawArrays(GL20.GL_LINE_LOOP, 8, 4);
		Gdx.gl.glDrawArrays(GL20.GL_LINE_LOOP, 12, 4);
		Gdx.gl.glDrawArrays(GL20.GL_LINE_LOOP, 16, 4);
		Gdx.gl.glDrawArrays(GL20.GL_LINE_LOOP, 20, 4);
	}

}
