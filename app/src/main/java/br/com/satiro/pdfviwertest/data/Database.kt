package br.com.satiro.pdfviwertest.data

import android.content.Context
import br.com.satiro.pdfviwertest.R
import br.com.satiro.pdfviwertest.domain.Doc

class Database {
    companion object{
        fun getDocsPpc() = listOf(
                Doc( "ppc_sistemas_sub.pdf" , R.drawable.ppc_sistemas_sub, "Técnico em Desenvovimento de Sistemas (Subsequente)" , 60 ),
                Doc( "" , R.drawable.ppc_sistemas_int, "Técnico em Desenvolvimento de Sistemas (Integrado)" , 0 ),
                Doc( "ppc_florestas.pdf" , R.drawable.ppc_floresta_int, "Técnico em Florestas (Integrado)" , 151 ),
                Doc( "ppc_ambiente.pdf", R.drawable.ppc_amb_sub, "Técnico em Meio Ambiente (Subsequente)" , 67 ),
                Doc( "" , R.drawable.ppc_manu, "Técnico em Manutenção e Suporte de Informática (Subsequente) " , 0)
            )


        fun getDocsGerais() = listOf(
                Doc( "" , R.drawable.ppc_amb_sub, "Técnico em Florestas (Integrado)", 50),
                Doc( "docG_regInterno.pdf" , R.drawable.ppc_amb_sub, "Regimento Disciplinar Discente", 31),
                Doc( "docG_regDidatico.pdf" , R.drawable.ppc_amb_sub, "Regulamento Didático Pedagógico", 117),
                Doc( "docG_calendario.pdf" , R.drawable.ppc_amb_sub, "Calendário Acadêmico 2017(Obsoleto)", 6),
                Doc( "docG_assistencia.pdf" , R.drawable.ppc_amb_sub, "Edital da Assitência Estudantil 2017 (Obsoleto)", 18),
                Doc( "docG_regraAbnt.pdf" , R.drawable.ppc_amb_sub, "Regras Da ABNT para trabalhos acadêmicos do IFPA", 57)
        )

        fun getDocsGremio() = listOf(
                Doc (  "ppp_sistemas_sub.pdf" , R.drawable.ppc_sistemas_sub , "Teste 1" , 45 )

        )

        fun saveActualPageSP( context: Context, key: String, page: Int ){
            context
                .getSharedPreferences("PREF", Context.MODE_PRIVATE)
                .edit()
                .putInt("$key-page", page)
                .apply()
        }

        fun getActualPageSP( context: Context, key: String )
            = context
                    .getSharedPreferences("PREF", Context.MODE_PRIVATE)
                    .getInt("$key-page", 0)

    }
}

