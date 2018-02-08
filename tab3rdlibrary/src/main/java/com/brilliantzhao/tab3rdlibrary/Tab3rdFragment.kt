package com.brilliantzhao.tab3rdlibrary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.blankj.utilcode.util.LogUtils
import com.brilliantzhao.baselibrary.base.BaseBingingFragment
import com.brilliantzhao.tab3rdlibrary.databinding.FragmentTab3rdBinding

/**
 * description:
 * Date: 2018/2/7 14:17
 * User: BrilliantZhao
 */
class Tab3rdFragment : BaseBingingFragment<FragmentTab3rdBinding>() {

    //##########################  custom variables start ##########################################

    //##########################   custom variables end  ##########################################

    //###################### override custom metohds start ########################################

    override fun createDataBinding(inflater: LayoutInflater?, container: ViewGroup?,
                                   savedInstanceState: Bundle?): FragmentTab3rdBinding {
        return FragmentTab3rdBinding.inflate(inflater!!, container, false)
    }

    override fun initView() {
    }

    override fun initEvent() {
    }

    override fun initData() {
    }

    override fun onLazyLoadOnce() {
        LogUtils.i(className + "-->onLazyLoadOnce")
    }

    override fun onVisibleToUser() {
        LogUtils.i(className + "-->onVisibleToUser")
    }

    override fun onInvisibleToUser() {
        LogUtils.i(className + "-->onInvisibleToUser")
    }

    //######################  override custom metohds end  ########################################

    //######################      custom metohds start     ########################################

    companion object {
        fun newInstance(): Tab3rdFragment {
            val fragment = Tab3rdFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }
    }

    //######################    custom metohds end   ##############################################

    //######################  override third methods start ########################################

    override fun onClick(v: View) {
        when (v.id) {

        }
    }

    //######################   override third methods end  ########################################

}