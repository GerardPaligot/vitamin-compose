package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.298f, 14.8053f)
                lineTo(8.0f, 12.1733f)
                lineTo(12.702f, 14.8053f)
                lineTo(11.652f, 9.52f)
                lineTo(15.6087f, 5.8613f)
                lineTo(10.2574f, 5.2267f)
                lineTo(8.0f, 0.3333f)
                lineTo(5.7427f, 5.2267f)
                lineTo(0.3914f, 5.8613f)
                lineTo(4.348f, 9.52f)
                lineTo(3.298f, 14.8053f)
                close()
                moveTo(10.8313f, 12.23f)
                lineTo(8.0f, 10.6453f)
                verticalLineTo(3.5167f)
                lineTo(9.3587f, 6.4627f)
                lineTo(12.5807f, 6.8447f)
                lineTo(10.1987f, 9.048f)
                lineTo(10.8313f, 12.23f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null