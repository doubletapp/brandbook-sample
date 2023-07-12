package ru.fiftytwochallenge.core.ui.circlebutton

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.core.view.updatePadding
import ru.nikistos.fifitytwochallenge.core.ui.circlebutton.R

class CircleButton : AppCompatImageView {

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    private fun init() {
        setImageDrawable(
            ContextCompat.getDrawable(
                context,
                ru.nikistos.fifitytwochallenge.core.brandbook.R.drawable.fifty_two_challenge_app_ic_arrow_24
            )
        )

        background = ContextCompat.getDrawable(
            context,
            R.drawable.fifty_two_challenge_app_circle_button_background,
        )

        val padding =
            resources.getDimensionPixelSize(R.dimen.fifty_two_challenge_app_circle_button_padding)
        updatePadding(padding, padding, padding, padding)
    }
}