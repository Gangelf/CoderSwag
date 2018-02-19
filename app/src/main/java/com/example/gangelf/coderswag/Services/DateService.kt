package com.example.gangelf.coderswag.Services

import com.example.gangelf.coderswag.Model.Category
import com.example.gangelf.coderswag.Model.Product
import java.util.*

/**
 * Created by Gangelf on 2/18/2018.
 */
object DateService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Graphic Beanie", "$18", "hat03"),
            Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
            Product("Devslopes Hoodie Red", "$32", "hoodie02"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie03"),
            Product("Devslopes Black Hoodie", "$32", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Gray", "$18", "shirt01"),
            Product("Devslopes Badge Light Gray", "$20", "shirt02"),
            Product("Devslopes Shirt Red", "$22", "shirt03"),
            Product("Devslopes Hustle", "$22", "shirt04"),
            Product("Kickflip Studios", "$18", "shirt05")
    )
}