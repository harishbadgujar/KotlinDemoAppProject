package com.example.kotlindemoappproject.project.sigletonproj

class SingltonManager private constructor(){

    companion object {
        private var instance : SingltonManager?=null

        fun getInstance() = synchronized(this){

            if (instance == null){

                instance = SingltonManager()

                instance


            }

        }



    }

}