<template>
  <div class="wrap">
    <!-- <div class="box1"> </div> -->
    <div class="denglu">
      <div>
          <div style="font-size:25px;color:#2b85e4; ">登陆</div>
          
          <Divider />
        <p>
          <Input v-model="value" placeholder="用户名 / 邮箱" style="width: 300px" class="kuang1"/>
        </p>
        <p>
          <Input v-model="value1" placeholder="密码" style="width: 300px" class="kuang1"/>
        </p>
      </div>
      <div>
        <div style="width:50%;float:left">
          <Checkbox v-model="single">记住密码？</Checkbox>
        </div>
        <div style="width:50%;float:left;color:#2b85e4;">忘记密码？</div>
      </div>

      <Button
        to="/home-page"
        type="success"
        style="font-size:20px;width:200px;margin-top:70px;background:#808695;border: none;"
        long
      >登录</Button>
      <div style="font-size:16px;color:#2b85e4; ">取消</div>
    </div>
    
  </div>
</template>

<script>
export default {
  data() {
    return {
      single: false,
      value: "",
      value1: "",
      username: "",
      pwd: "",
      message: "",
      QRCode: JSON.stringify({ username: this.username, pwd: this.pwd }),
      dialogVisible: false
    };
  },
  created() {},
  methods: {
    // login() {
    //   var _this = this;
    //   this.$http.get("http://localhost:8081/login.json").then(response => {
    //     const result = response.data;
    //     if (result.code === 0) {
    //       var data = result.data;
    //       this.tableData = data.tableData;
    //       if (
    //         this.tableData[0].username == this.username &&
    //         this.tableData[0].pwd == this.pwd
    //       ) {
    //         this.$router.push({
    //           //核心语句
    //           path: "/helloworld", //跳转的路径
    //         });
    //       } else {
    //         alert("用户名或密码错误！");
    //       }
    //     } else {
    //       alert(result.msg);
    //     }
    //   });
    // },
    // handleClose(done) {
    //   this.$confirm("确认关闭？")
    //     .then(_ => {
    //       done();
    //     })
    //     .catch(_ => {});
    // }
  }
};
</script>
<style scoped>
.wrap {
  width: 100%;
  height: 100vh;
  background-size: 100% 100%;
  background-position: 0 40%;
  overflow: hidden;
}
.denglu {
  width: 350px;
  height: 400px;
  margin: 480px auto;
  text-align: center;
  color: gray;
  margin-top: 100px;
  border: 1px black solid;
  border-radius: 15px;
}
.denglu p {
  width: 300px;
  height: 50px;
  color: lightgrey;
  margin-top: 30px;
}
.kuang1 {
  width: 100%;
  height: 80%;
  font-size: 16px;
  border: none;
  margin-left: 25px;
}
.box1 {
  width: 500px;
  height: 20px;
  margin: auto;
}
/* #msg {
  width: 200px;
  height: 200px;
} */
</style>
