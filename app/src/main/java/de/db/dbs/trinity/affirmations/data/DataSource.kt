package de.db.dbs.trinity.affirmations.data

import de.db.dbs.trinity.affirmations.R
import de.db.dbs.trinity.affirmations.model.Affirmation

class DataSource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image0),
            Affirmation(R.string.affirmation3, R.drawable.image2),
            Affirmation(R.string.affirmation4, R.drawable.image3),
            Affirmation(R.string.affirmation5, R.drawable.image4),
            Affirmation(R.string.affirmation6, R.drawable.image5),
            Affirmation(R.string.affirmation7, R.drawable.image6),
            Affirmation(R.string.affirmation8, R.drawable.image7),
            Affirmation(R.string.affirmation9, R.drawable.image8),
            Affirmation(R.string.affirmation10, R.drawable.image9),
//            Affirmation(R.string.affirmation11, R.drawable.image10),
//            Affirmation(R.string.affirmation12, R.drawable.image1),
//            Affirmation(R.string.affirmation13, R.drawable.image9),
//            Affirmation(R.string.affirmation14, R.drawable.image7),
//            Affirmation(R.string.affirmation15, R.drawable.image2),
//            Affirmation(R.string.affirmation16),
//            Affirmation(R.string.affirmation17),
//            Affirmation(R.string.affirmation18),
//            Affirmation(R.string.affirmation19),
//            Affirmation(R.string.affirmation20)

        )
    }

}