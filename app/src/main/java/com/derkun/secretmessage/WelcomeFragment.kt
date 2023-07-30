package com.derkun.secretmessage

/**
 * @author A.V.Derkun
 * @time 10:38 a.m. 27.07.2023
 */
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class WelcomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //  В этом месте получаем ссылку на корневое представление фрагмента
        val view =  inflater.inflate(R.layout.fragment_welcome, container, false)
        // Используем корневое представление с целью получения ссылку для кнопки старта фрагмента
        val startButton = view.findViewById<Button>(R.id.start)

        //Вызываем setOnClickListener для startButton
        startButton.setOnClickListener {
            // Нижеуказанный код который будет переносить пользователя на следующий экран,
            // когда происходит нажатие по кнопке старта
            view.findNavController()
                .navigate(R.id.action_welcomeFragment2_to_messageFragment)

        }
        // Возвращаем ссылку на корневое представление
        return view
    }

}