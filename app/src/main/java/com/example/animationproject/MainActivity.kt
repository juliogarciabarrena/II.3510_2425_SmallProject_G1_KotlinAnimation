package com.example.animationproject

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.example.animationproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        //We load the animation
        val ttbAnim = AnimationUtils.loadAnimation(this, R.anim.ttb)
        val ttbAltAnim = AnimationUtils.loadAnimation(this, R.anim.ttb_alt)
        val jFadeAnim = AnimationUtils.loadAnimation(this, R.anim.jevil_fade)
        val ralseiAnim = AnimationUtils.loadAnimation(this, R.anim.btt_alt2)
        val krisAnim = AnimationUtils.loadAnimation(this, R.anim.btt)
        val susieAnim = AnimationUtils.loadAnimation(this,R.anim.btt_alt1)



        //We fetch the views that will perform the animation
        val titleText = findViewById(R.id.titleText) as TextView
        val subtitleText = findViewById(R.id.subtitleText) as TextView
        val jevilImage = findViewById(R.id.imageJevil) as ImageView
        val ralseiImg = findViewById(R.id.ralseiImage) as ImageView
        val krisImg = findViewById(R.id.krisImage) as ImageView
        val susieImg = findViewById(R.id.susieImage) as ImageView




        //Loads the animations
        titleText.startAnimation(ttbAnim)
        subtitleText.startAnimation(ttbAltAnim)
        jevilImage.startAnimation(jFadeAnim)

        ralseiImg.startAnimation(ralseiAnim)
        krisImg.startAnimation(krisAnim)
        susieImg.startAnimation(susieAnim)


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}