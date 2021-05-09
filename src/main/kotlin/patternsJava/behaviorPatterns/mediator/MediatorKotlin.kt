/*------------------------------------------------------------------------------
 ilnurv : 2021-4-25 7:47
 -----------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------
 ilnurv : 2021-4-25 6:49
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.mediator



//посредник между объектами

interface QA {
    fun doesMyCodeWork(): Boolean
}

interface Parrot {
    fun isEating(): Boolean
    fun isSleeping(): Boolean
}

object Kenny : QA, Parrot {
    val developer = Me
    override fun doesMyCodeWork(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEating(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isSleeping(): Boolean {
        TODO("Not yet implemented")
    }

}

object Brad : QA, Parrot {
    val senior = Kenny
    val developer = Me
    override fun doesMyCodeWork(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEating(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isSleeping(): Boolean {
        TODO("Not yet implemented")
    }
}

object George : QA, Parrot {
    val peer = George
    val mate = Kenny
    val developer = Me

    override fun doesMyCodeWork(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEating(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isSleeping(): Boolean {
        TODO("Not yet implemented")
    }

    fun isWatchingFootball(): Boolean {
        TODO("Not yet implemented")
    }

}

object Me {

}

class MyMind {
    val qa = Kenny
    val qa2 = Brad
    val qa3 = George
    val translator = Sandra

    fun taskCompleted(isMajorRelease: Boolean) {
        if (!Kenny.isEating() && !Kenny.isSleeping()) {
            println(Kenny.doesMyCodeWork())
        } else if (!Brad.isEating() && !Brad.isSleeping()) {
            println(Brad.doesMyCodeWork())
        } else if (!George.isWatchingFootball()) {
            println(George.doesMyCodeWork())
        }

        if (isMajorRelease) {
            println(Sandra.areAllTextCorrect())
        }
    }
}

interface CopyWriter {
    fun areAllTextCorrect(): Boolean
}

interface Kiwi

object Sandra : CopyWriter, Kiwi {
    override fun areAllTextCorrect(): Boolean {
        TODO("Not yet implemented")
    }

}


//here comes mediator

interface Manager {
    fun isAllGood(majorRelease: Boolean): Boolean
}

object Michael : Manager {
    val qa = Kenny
    val qa2 = Brad
    val qa3 = George
    val translator = Sandra
    override fun isAllGood(majorRelease: Boolean): Boolean {
        if (!Kenny.isEating() && !Kenny.isSleeping()) {
            println(Kenny.doesMyCodeWork())
        } else if (!Brad.isEating() && !Brad.isSleeping()) {
            println(Brad.doesMyCodeWork())
        } else if (!George.isWatchingFootball()) {
            println(George.doesMyCodeWork())
        }
        return true
    }
}

class MyPeacefulMind(private val manager: Manager) {
    fun taskCompleted(isMajorRelease: Boolean) {
        println(manager.isAllGood(isMajorRelease))
    }
}

//Now, if somebody needs somebody else's opinion, they need to go through
//Michael first.