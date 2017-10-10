package com.ru.tgra;

import com.ru.tgra.utilities.Color;
import com.ru.tgra.utilities.Point3D;
import com.ru.tgra.utilities.Vector3D;

public class Settings
{
    /* === Viewport IDs === */
    public static final int viewportIDPerspective = 0;
    public static final int viewportIDMinimap = 1;

    /* === Maze settings === */
    // Height and width MUST both be odd numbers
    public static final int height = 25;
    public static final int width = 25;

    /* === Player settings === */
    public static final float playerFOV = 60f;
    public static final float playerSpeed = 1f;
    public static final float playerLookSensitivity = 100f;

    /* === Colors === */
    // Walls
    public static final Color wallAmbience = new Color(0.0f, 0.0f, 0.0f, 0.0f);
    public static final Color wallDiffuse = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    public static final Color wallSpecular = new Color(0.0f, 0.0f, 0.0f, 0.0f);
    public static final Color wallEmission = new Color(0.0f, 0.0f, 0.0f, 0.0f);
    public static final float wallShininess = 128f;
    public static final float wallTransparency = 1f;

    // Floor
    public static final Color floorAmbience = new Color(0.0f, 0.0f, 0.0f, 0.0f);
    public static final Color floorDiffuse = new Color(0.5f, 0.5f, 0.5f, 1.0f);
    public static final Color floorSpecular = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    public static final Color floorEmission = new Color(0.0f, 0.0f, 0.0f, 0.0f);
    public static final float floorShininess = Float.MAX_VALUE;
    public static final float floorTransparency = 1f;

    // End point
    public static final Color endPointAmbience = new Color(0.0f, 0.0f, 0.0f, 0.0f);
    public static final Color endPointDiffuse = new Color(1.0f, 0f, 0f, 1.0f);
    public static final Color endPointSpecular = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    public static final Color endPointEmission = new Color(1.0f, 0.0f, 0.0f, 1.0f);
    public static final float endPointShininess = 128f;
    public static final float endPointTransparency = 1f;

    // Player
    public static final Color playerAmbience = new Color(0.0f, 0.0f, 0.0f, 0.0f);
    public static final Color playerDiffuse = new Color(1.0f, 1.0f, 0f, 1.0f);
    public static final Color playerSpecular = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    public static final Color playerEmission = new Color(1.0f, 1.0f, 0.0f, 1.0f);
    public static final float playerShininess = 128f;
    public static final float playerTransparency = 1f;

    // Light
    public static final Color globalAmbience = new Color(0.5f, 0.0f, 0.0f, 1.0f);;
    public static final Color lightColor = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    public static final Point3D lightPosition = new Point3D(Settings.width / 2, 10.0f, Settings.height / 2);
    public static final Vector3D lightDirection = new Vector3D(0.0f, -1.0f, 0.0f);
    public static final float lightSpotFactor = 7.0f;
    public static final float lightConstantAttenuation = 0.3f;
    public static final float lightLinearAttenuation = 0.7f;
    public static final float lightQuadraticAttenuation = 0.3f;
}
