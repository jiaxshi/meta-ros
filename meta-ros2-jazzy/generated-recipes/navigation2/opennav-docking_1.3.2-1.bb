# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "A Task Server for robot charger docking"
AUTHOR = "Steve Macenski <steve@opennav.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "navigation2"
ROS_BPN = "opennav_docking"

ROS_BUILD_DEPENDS = " \
    angles \
    builtin-interfaces \
    geometry-msgs \
    nav-msgs \
    nav2-graceful-controller \
    nav2-msgs \
    nav2-util \
    opennav-docking-core \
    pluginlib \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    sensor-msgs \
    tf2-ros \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    builtin-interfaces \
    geometry-msgs \
    nav-msgs \
    nav2-graceful-controller \
    nav2-msgs \
    nav2-util \
    opennav-docking-core \
    pluginlib \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    sensor-msgs \
    tf2-ros \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    builtin-interfaces \
    geometry-msgs \
    nav-msgs \
    nav2-graceful-controller \
    nav2-msgs \
    nav2-util \
    opennav-docking-core \
    pluginlib \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    sensor-msgs \
    tf2-ros \
    yaml-cpp-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/jazzy/opennav_docking/1.3.2-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/opennav_docking"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "06c983c12bf21fa2ecf378ea2c66d3a7c7146e4b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
