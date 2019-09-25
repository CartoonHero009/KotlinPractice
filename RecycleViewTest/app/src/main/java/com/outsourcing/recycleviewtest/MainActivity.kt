package com.outsourcing.recycleviewtest

import android.os.Bundle
import android.view.*
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.test_layout.view.*
import android.app.Activity
import android.content.Context
import android.os.Build
import android.util.DisplayMetrics
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.outsourcing.models.applyEdit
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import kotlin.collections.ArrayList
import kotlin.time.*
import com.outsourcing.models.NotificationSetUtil

class MainActivity : AppCompatActivity() {

    private val testArray = ArrayList<String>(3)
    private val lastVisibleItemPosition: Int
        get() = (testListView.layoutManager as LinearLayoutManager).findLastVisibleItemPosition()

    private var aaa = true

    @UseExperimental(ExperimentalTime::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val testString = DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS")
                .withZone(ZoneOffset.UTC)
                .format(Instant.now())

            val sharedPrefs = getSharedPreferences("TEST", Context.MODE_PRIVATE)
            sharedPrefs.applyEdit {
                putString("Test_String", testString)
            }
            val aaa = ""
            val testDate = LocalDateTime.parse(
                testString, DateTimeFormatter
                    .ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSS")
                    .withZone(ZoneOffset.UTC)
            )

            val today = LocalDateTime.now()
            val check = today.isAfter(testDate.plusDays(30))

        }

    }

    override fun onStart() {
        super.onStart()
        testArray.add("A")
        testArray.add("B")
        testArray.add("C")
        val adapter = RecyclerAdapter(this, testArray)
        testListView.adapter = adapter
        val itemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        //itemDecoration.setDrawable(resources.getDrawable(R.drawable.divider_line))
        testListView.addItemDecoration(itemDecoration)
        testListView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                val totalItemCount = recyclerView.layoutManager!!.itemCount
                if (totalItemCount == lastVisibleItemPosition + 1) {
                    //requestPhoto()
                }
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
            }
        })

//        if (aaa) {
//            val intent = Intent()
//            intent.action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
//            val uri =
//                Uri.fromParts("package", this.getPackageName(), null)
//            intent.data = uri
//            startActivity(intent)
//            aaa = false
//        }
        NotificationSetUtil.openNotificationSetting(this, "bbbb", object :
            NotificationSetUtil.OnNextLitener {
            override fun onNext() {
                print("sss")
            }

            override fun onError(message: String) {
                print("bbb")
            }
        })

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
    inner class RecyclerAdapter(private val context:Context, private val dataSource: ArrayList<String>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.test_layout, parent, false)
            return ViewHolder(itemView)
        }

        override fun getItemCount(): Int {
            return dataSource.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val displaymetrics = DisplayMetrics()

            (context as Activity).windowManager.defaultDisplay.getMetrics(displaymetrics)
            //if you need three fix imageview in width
            val devicewidth = displaymetrics.widthPixels / 3

            //if you need 4-5-6 anything fix imageview in height
            val deviceheight = displaymetrics.heightPixels / 4

            holder.itemView.getLayoutParams().width = devicewidth

            //if you need same height as width you can set devicewidth in holder.image_view.getLayoutParams().height
            holder.itemView.getLayoutParams().height = deviceheight
            holder.bindData(dataSource.get(position))
        }

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bindData(str:String) {
                itemView.textView.text = str
                //notifyDataSetChanged()
            }
        }
    }
}
