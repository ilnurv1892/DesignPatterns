/*------------------------------------------------------------------------------
 ilnurv : 2021-4-25 6:47
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns

//интерпретатор?

/*
val sql = select("name, age", {
    from("users", {
        where("age > 25")
    }) // Closes from
}) // Closes select*/

/*
select("name, age", {
    this@select.from("users", {
        this@from.where("age > 25")
    })
})*/