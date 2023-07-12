package ru.fiftytwochallenge.core.ui.actionbutton

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import ru.nikistos.fifitytwochallenge.core.ui.actionbutton.R

class ActionButton : AppCompatButton {

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
        background = ContextCompat.getDrawable(
            context,
            R.drawable.fifty_two_challenge_app_action_button_background
        )
        setTextAppearance(ru.nikistos.fifitytwochallenge.core.brandbook.R.style.fifty_two_challenge_app_text_style_menu_style)
        setTextColor(
            ContextCompat.getColor(
                context,
                ru.nikistos.fifitytwochallenge.core.brandbook.R.color.fifty_two_challenge_app_color_text_inverse_color
            )
        )
    }
}