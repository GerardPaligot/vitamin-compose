package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Exchange: ImageVector
    get() {
        if (_exchange != null) {
            return _exchange!!
        }
        _exchange = Builder(name = "Exchange", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.3301f, 1.9965f)
                curveTo(1.3301f, 1.6284f, 1.6285f, 1.33f, 1.9966f, 1.33f)
                horizontalLineTo(13.9936f)
                curveTo(14.3617f, 1.33f, 14.6601f, 1.6284f, 14.6601f, 1.9965f)
                verticalLineTo(13.9935f)
                curveTo(14.6601f, 14.3616f, 14.3617f, 14.66f, 13.9936f, 14.66f)
                horizontalLineTo(1.9966f)
                curveTo(1.6285f, 14.66f, 1.3301f, 14.3616f, 1.3301f, 13.9935f)
                verticalLineTo(1.9965f)
                close()
                moveTo(2.6631f, 2.663f)
                verticalLineTo(13.327f)
                horizontalLineTo(13.3271f)
                verticalLineTo(2.663f)
                horizontalLineTo(2.6631f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1708f, 7.5446f)
                lineTo(7.1534f, 8.4454f)
                lineTo(6.3443f, 9.328f)
                horizontalLineTo(11.3276f)
                verticalLineTo(10.661f)
                horizontalLineTo(6.3443f)
                lineTo(7.1534f, 11.5436f)
                lineTo(6.1708f, 12.4444f)
                lineTo(3.9251f, 9.9945f)
                lineTo(6.1708f, 7.5446f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8194f, 8.4454f)
                lineTo(12.0651f, 5.9955f)
                lineTo(9.8194f, 3.5456f)
                lineTo(8.8368f, 4.4464f)
                lineTo(9.6458f, 5.329f)
                horizontalLineTo(4.6626f)
                verticalLineTo(6.662f)
                horizontalLineTo(9.6459f)
                lineTo(8.8368f, 7.5446f)
                lineTo(9.8194f, 8.4454f)
                close()
            }
        }
        .build()
        return _exchange!!
    }

private var _exchange: ImageVector? = null