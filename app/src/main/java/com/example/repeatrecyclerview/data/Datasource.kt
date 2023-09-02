package com.example.repeatrecyclerview.data

import com.example.repeatrecyclerview.R
import com.example.repeatrecyclerview.model.Messages

class Datasource {
    fun loadMessages() : List<Messages> {
        return listOf<Messages>(
            Messages(R.string.affirmation1),
            Messages(R.string.affirmation2),
            Messages(R.string.affirmation3),
            Messages(R.string.affirmation4),
            Messages(R.string.affirmation5),
            Messages(R.string.affirmation6),
            Messages(R.string.affirmation7),
            Messages(R.string.affirmation8),
            Messages(R.string.affirmation9),
            Messages(R.string.affirmation10),
        )

    }
}
