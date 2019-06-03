<template>
  <div>
      <Row>
      <i-col class-name="nav1" :xs="24" :sm="24" :md="24" :lg="5" :xl="3">
        <div class="iconimg">
          <img src="../assets/nav1.svg" alt>
        </div>
      </i-col>

      <i-col class-name="nav2" :xs="0" :sm="0" :md="0" :lg="0" :xl="7">
        <span>侃度互联网平台</span>
      </i-col>
      <i-col class-name="nav3" :xs="0" :sm="0" :md="0" :lg="19" :xl="14">
        
      </i-col>
    </Row>
    <i-col class-name="" :xs="24" :sm="24" :md="24" :lg="24" :xl="24">
        <div class="step-head">
      <Steps :current="current">
        <Step title="步骤1"></Step>
        <Step title="步骤2">2</Step>
        <Step title="步骤3">3</Step>
      </Steps>
    </div>
      </i-col>
    

    <div class="step-content">
      <div class="wrap" v-if="current===0">
        <div class="wrap-chlien">
          用户名：
          <Input v-model="value" placeholder="请输入用户名" style="width: 300px"/>
          <br>
          <br>密码：&nbsp;&nbsp;&nbsp;&nbsp;
          <Input v-model="value1" placeholder="请输入密码" style="width: 300px"/>
          <br>
          <br>邮箱：&nbsp;&nbsp;&nbsp;&nbsp;
          <Input v-model="value2" placeholder="请输入邮箱" style="width: 300px"/>
          <br>
          <br>
          <RadioGroup v-model="animal">
            <Radio label="个人"></Radio>
            <Radio label="团体（企业丶政府丶组织等）"></Radio>
          </RadioGroup>
        </div>

        <div class="step-bnt">
          <Button style="margin-right:30px">取消</Button>
          <Button type="primary" @click="next">下一步</Button>
        </div>
      </div>
      <div class="wrap" v-else-if="current===1">
        <div class="wrap-chlien">
          <p style="font-size:20px">我们已根据您填写的信息向您的邮箱发送了验证请求，请根据邮件内容填写下面的内容！</p>
          <Input v-model="value" placeholder="请输入授权码" style="width: 300px;margin-top:100px;"/>
          <br>
          <br>
        </div>
        <div class="step-bnt">
          <Button style="margin-right:30px">获取授权码</Button>
          <Button type="primary" @click="next">下一步</Button>
        </div>
      </div>
      <div class="wrap" v-else>
        <div class="wrap-chlien">
          <Alert type="success" show-icon>
            注册成功
            <span slot="desc">过十五秒后自动关闭。。。</span>
          </Alert>
        </div>
        <div class="step-bnt">
          <Button style="margin-right:30px" to="login">立即登录</Button>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      animal: "个人",
      current: 0,
      value: "",
      value1: "",
      value2: "",
      value3: "",
      value4: false,
      buttonSize: "large"
    };
  },
  methods: {
    next() {
      if (this.current == 2) {
        this.current = 0;
      } else {
        this.current += 1;
      }
    }
  }
};
</script>
<style scoped>
.wrap {
  width: 100%;
  height: 300px;
  padding: 15px;
}
.wrap-chlien {
  width: 60%;
  height: 250px;
  margin: 0 auto;
  margin-top: 100px;
}
.step-head {
  width: 1000px;
  margin: 0 auto;
  margin-top: 50px
}
.step-bnt {
  width: 1000px;
  margin: 0 auto;
}
.nav1 {
  height: 70px;
  border-bottom: 1.5px solid #dcdee2;
}
.iconimg img {
  height: 70px;
  display: block;
  margin: 0 auto;
}
.nav2 {
  height: 70px;
  border-bottom: 1.5px solid #dcdee2;
  line-height: 70px;
  font-size: 20px;
}
.nav3 {
  height: 70px;
  border-bottom: 1.5px solid #dcdee2;
}
.code-row-bg {
  margin-top: 50px;
}
</style>
