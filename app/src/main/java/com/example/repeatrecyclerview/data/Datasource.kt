package com.example.repeatrecyclerview.data

import com.example.repeatrecyclerview.R
import com.example.repeatrecyclerview.model.Messages

class Datasource {
    fun loadMessages(): List<Messages> {
        return listOf<Messages>(
            Messages(R.string.affirmation1, R.drawable.image1),
            Messages(R.string.affirmation2, R.drawable.image2),
            Messages(R.string.affirmation3, R.drawable.image3),
            Messages(R.string.affirmation4, R.drawable.image4),
            Messages(R.string.affirmation5, R.drawable.image5),
            Messages(R.string.affirmation6, R.drawable.image6),
            Messages(R.string.affirmation7, R.drawable.image7),
            Messages(R.string.affirmation8, R.drawable.image8),
            Messages(R.string.affirmation9, R.drawable.image9),
            Messages(R.string.affirmation10, R.drawable.image10),
        )

    }
}
