<template>
  <div>
    <Row class="navbar">
      <i-col class-name="nav1" :xs="20" :sm="20" :md="20" :lg="4" :xl="3">
        <div class="iconimg">
          <div><img src="../assets/nav1.svg" alt></div>
          <!-- <div><span>侃度互联网平台</span></div> -->
        </div>
        
      </i-col>

      <i-col class-name="nav2" :xs="0" :sm="0" :md="0" :lg="7" :xl="9">
        <span>侃度互联网平台</span>
      </i-col>
      <i-col class-name="nav3" :xs="0" :sm="0" :md="0" :lg="8" :xl="7">
        <Menu mode="horizontal" style="height:70px; line-height:70px;border:none">
          <MenuItem name="1">
            <p>首页</p>
          </MenuItem>
          <MenuItem name="2">
            <p>文档</p>
          </MenuItem>
          <MenuItem name="3">
            <p>商城</p>
          </MenuItem>
          <Submenu name="4">
            <template slot="title">
              <!-- v1 -->
              <span>论坛</span>
            </template>
            <MenuGroup title="使用">
              <MenuItem name="3-1">新增和启动</MenuItem>
              <MenuItem name="3-2">活跃分析</MenuItem>
              <MenuItem name="3-3">时段分析</MenuItem>
            </MenuGroup>
            <MenuGroup title="留存">
              <MenuItem name="3-4">用户留存</MenuItem>
              <MenuItem name="3-5">流失用户</MenuItem>
            </MenuGroup>
          </Submenu>
        </Menu>
      </i-col>
      <i-col class-name="nav3" :xs="0" :sm="0" :md="0" :lg="5" :xl="5">
        <div class="bnt" style="height:70px; line-height:70px;text-align:center;">
          <Button :size="buttonSize" type="text" style="margin-right:20px">登录</Button>
          <Button type="primary" to="register">注册</Button>
        </div>
      </i-col>
      <i-col class-name="nav4" :xs="4" :sm="4" :md="4" :lg="0" :xl="0">
        <div style="text-align:center;margin-top:20px;">
          <Button @click="value1 = true" type="primary">Open</Button>
        </div>
        <Drawer title :closable="false" v-model="value1">
          <Menu mode="horizontal" active-name="1">
            <MenuItem name="1" style="width:100%;">首页</MenuItem>
            <MenuItem name="2" style="width:100%;">文档</MenuItem>
            <MenuItem name="3" style="width:100%;">商城</MenuItem>
            <MenuItem name="4" style="width:100%;">论坛</MenuItem>

            <div class="bnt">
              <Button shape="circle">登录</Button>
              <Button shape="circle" icon="ios-search" style="margin-left:20px;">注册</Button>
            </div>
          </Menu>
        </Drawer>
      </i-col>
    </Row>
    <Row type="flex" justify="center" class="code-row-bg">
      <i-col class="body-left" :xs="20" :sm="20" :md="20" :lg="20" :xl="20" :xxl="20">
        <div class="body-left-con">
          <div class="cut-off-rule">
            <p style="font-weight:500;font-size:50px;color:black;margin-top:50px;">CD-things</p>
          </div>

          <p style="font-size:25px;color:gray;margin-top:60px;">瞭望塔•智能监测平台</p>
          <div style="margin-top:100px;">
            <Button
              shape="circle"
              :size="buttonSize"
              icon="md-desktop"
              style="height:40px;margin-right:30px"
              to="/Helloworld"
            >可视化平台</Button>
            <Button
              shape="circle"
              :size="buttonSize"
              icon="md-contacts"
              style="height:40px;margin-right:30px"
            >设备管理</Button>
            <Button
              shape="circle"
              :size="buttonSize"
              icon="ios-call"
              style="height:40px;margin-right:30px"
            >客服帮助</Button>
            <Button shape="circle" :size="buttonSize" icon="md-download" style="height:40px">Github</Button>
          </div>
        </div>
      </i-col>
    </Row>
  </div>
</template>
<script>
export default {
  data() {
    return {
      value: "",
      value1: false,
      buttonSize: "large"
    };
  }
};
</script>
<style scoped>
.cut-off-rule {
  width: 230px;
  border-bottom: 3px black solid;
}
.navbar {
  height: 72px;
  border-bottom: 1.5px solid #dcdee2;
}
.nav1 {
  height: 70px;
}
.iconimg img {
  height: 70px;
  display: block;
  margin: 0 auto;
}
.nav2 {
  height: 70px;
  line-height: 70px;
  font-size: 20px;
}
.nav3 {
  height: 70px;
}
.nav4 {
  height: 70px;
}
.code-row-bg {
  margin-top: 50px;
}
.ivu-menu-horizontal.ivu-menu-light:after {
  content: "";
  display: block;
  /* width: 100%; */
  height: 0px;
  background: #dcdee2;
  position: absolute;
  bottom: 0;
  left: 0;
}
</style>
