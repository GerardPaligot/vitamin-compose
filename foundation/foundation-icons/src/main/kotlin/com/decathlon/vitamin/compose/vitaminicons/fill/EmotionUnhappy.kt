package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.EmotionUnhappy: ImageVector
    get() {
        if (_emotionUnhappy != null) {
            return _emotionUnhappy!!
        }
        _emotionUnhappy = Builder(name = "EmotionUnhappy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.6667f)
                curveTo(4.318f, 14.6667f, 1.3334f, 11.682f, 1.3334f, 8.0f)
                curveTo(1.3334f, 4.318f, 4.318f, 1.3334f, 8.0f, 1.3334f)
                curveTo(11.682f, 1.3334f, 14.6667f, 4.318f, 14.6667f, 8.0f)
                curveTo(14.6667f, 11.682f, 11.682f, 14.6667f, 8.0f, 14.6667f)
                close()
                moveTo(4.6667f, 11.3334f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 10.8029f, 6.2108f, 10.2942f, 6.5858f, 9.9192f)
                curveTo(6.9609f, 9.5441f, 7.4696f, 9.3334f, 8.0f, 9.3334f)
                curveTo(8.5305f, 9.3334f, 9.0392f, 9.5441f, 9.4143f, 9.9192f)
                curveTo(9.7893f, 10.2942f, 10.0f, 10.8029f, 10.0f, 11.3334f)
                horizontalLineTo(11.3334f)
                curveTo(11.3334f, 10.4493f, 10.9822f, 9.6015f, 10.3571f, 8.9763f)
                curveTo(9.7319f, 8.3512f, 8.8841f, 8.0f, 8.0f, 8.0f)
                curveTo(7.116f, 8.0f, 6.2681f, 8.3512f, 5.643f, 8.9763f)
                curveTo(5.0179f, 9.6015f, 4.6667f, 10.4493f, 4.6667f, 11.3334f)
                close()
                moveTo(5.3334f, 7.3334f)
                curveTo(5.5986f, 7.3334f, 5.8529f, 7.228f, 6.0405f, 7.0405f)
                curveTo(6.228f, 6.8529f, 6.3334f, 6.5986f, 6.3334f, 6.3334f)
                curveTo(6.3334f, 6.0682f, 6.228f, 5.8138f, 6.0405f, 5.6263f)
                curveTo(5.8529f, 5.4387f, 5.5986f, 5.3334f, 5.3334f, 5.3334f)
                curveTo(5.0682f, 5.3334f, 4.8138f, 5.4387f, 4.6263f, 5.6263f)
                curveTo(4.4387f, 5.8138f, 4.3334f, 6.0682f, 4.3334f, 6.3334f)
                curveTo(4.3334f, 6.5986f, 4.4387f, 6.8529f, 4.6263f, 7.0405f)
                curveTo(4.8138f, 7.228f, 5.0682f, 7.3334f, 5.3334f, 7.3334f)
                close()
                moveTo(10.6667f, 7.3334f)
                curveTo(10.9319f, 7.3334f, 11.1863f, 7.228f, 11.3738f, 7.0405f)
                curveTo(11.5613f, 6.8529f, 11.6667f, 6.5986f, 11.6667f, 6.3334f)
                curveTo(11.6667f, 6.0682f, 11.5613f, 5.8138f, 11.3738f, 5.6263f)
                curveTo(11.1863f, 5.4387f, 10.9319f, 5.3334f, 10.6667f, 5.3334f)
                curveTo(10.4015f, 5.3334f, 10.1471f, 5.4387f, 9.9596f, 5.6263f)
                curveTo(9.7721f, 5.8138f, 9.6667f, 6.0682f, 9.6667f, 6.3334f)
                curveTo(9.6667f, 6.5986f, 9.7721f, 6.8529f, 9.9596f, 7.0405f)
                curveTo(10.1471f, 7.228f, 10.4015f, 7.3334f, 10.6667f, 7.3334f)
                close()
            }
        }
        .build()
        return _emotionUnhappy!!
    }

private var _emotionUnhappy: ImageVector? = null